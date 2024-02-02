package headfirst.designpatterns.observer.weather;

import java.util.*;

public class WeatherData implements Subject {
	private List<TempHumPressObserver> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<TempHumPressObserver>();
	}
	
	public void registerObserver(TempHumPressObserver o) {
		observers.add(o);
	}
	
	public void removeObserver(TempHumPressObserver o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (TempHumPressObserver observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	// This is a method that simulates the actual change in measurements, 
	// it's not a part of the design pattern - just a way for us to 
	// simulate a change. 
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

//	public float getTemperature() {
//		return temperature;
//	}
//	
//	public float getHumidity() {
//		return humidity;
//	}
//	
//	public float getPressure() {
//		return pressure;
//	}

}
