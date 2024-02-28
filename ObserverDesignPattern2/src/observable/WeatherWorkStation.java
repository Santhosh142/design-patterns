package observable;
import observer.Observer;
import java.util.List;
import java.util.ArrayList;

public class WeatherWorkStation implements Subject {
	float temparature, humidity, pressure;
	List<Observer> observers = new ArrayList<>();
	
	public void setMeasurements(float temparature, float humidity, float pressure) {
		this.temparature = temparature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(temparature, humidity, pressure);
		}
	}
}
