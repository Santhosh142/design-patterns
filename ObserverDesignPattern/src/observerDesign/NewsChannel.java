package observerDesign;

public class NewsChannel implements Channel {
	
	String news;
	String channelName;

	@Override
	public void update(Object o) {
		this.setNews((String) o);
		
	}

	private void setNews(String news) {
		this.news = news;
		
	}
	public void setChannelName(String name) {
		this.channelName = name;
	}
	
	public String getNews() {
		return news + ": reporting from " + channelName + " newsChannel";
	}

}
