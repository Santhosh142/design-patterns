package observer;

import observable.WeatherWorkStation;
import observer.Observer;
public class Main {

	public static void main(String[] args) {
		Observer ob1 = new DisplayDevice();
		Observer ob2 = new DisplayDevice();
		WeatherWorkStation station = new WeatherWorkStation();
		
		station.addObserver(ob1);
		station.addObserver(ob2);
		station.setMeasurements(23, 10, 15);
		station.setMeasurements(40, 10, 86);
		
	}

}
