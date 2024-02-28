package observer;

public class DisplayDevice implements Observer {
	float temperature, humidity, pressure;
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	private void display() {
		System.out.println("Temperature: " + temperature + " and pressure: " + pressure);
		
	}
}
