package observerDesign;
import java.util.List;
import java.util.ArrayList;

public class NewsAgency {
	
	private String news;
	List<Channel> channels = new ArrayList<>();
	
	public void addObserver(Channel channel) {
		channels.add(channel);
	}
	
	public void removeObserver(Channel channel) {
		channels.remove(channel);
	}
	
	public void setNews(String news) {
		this.news = news;
		
		for(Channel channel: channels) {
			channel.update(news);
		}
	}

}
