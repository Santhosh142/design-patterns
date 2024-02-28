package observerDesign;

public class Main {

	public static void main(String[] args) {
		NewsChannel sakshi = new NewsChannel();
		sakshi.setChannelName("SakshiTV");
		NewsChannel tv9 = new NewsChannel();
		tv9.setChannelName("TV9");
		
		NewsAgency agency = new NewsAgency();
		agency.addObserver(sakshi);
		agency.addObserver(tv9);
		
		agency.setNews("YCP defeated with margin of 80 seats");
		String res = sakshi.getNews();
		String res1 = tv9.getNews();
		
		
		System.out.println(res);
		System.out.println(res1);

	}

}
