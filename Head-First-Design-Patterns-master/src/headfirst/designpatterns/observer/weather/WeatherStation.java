
package headfirst.designpatterns.observer.weather;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		// Q3: uncomment the two lines of code below and fill in the blanks.
		// Note that you don't need to specify the types of parameters 
		// for the update method (Java can infer those), but you need the names.
		// When humidity is >= 90, bring the umbrella! 
		//Observer needUmbrella = (......)-> {if ..... System.out.println("Bring an umbrella!");};
		//weatherData.registerObserver(needUmbrella);
		
		// Q4: 
		// Create and register another observer that detects some other 
		// condition (say, temperatures below freezing) and provides
		// some advice to the user (like wearing a hat). 
		// You may need to add more setMeasurements calls below. 

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
		weatherData.removeObserver(forecastDisplay);
		weatherData.setMeasurements(62, 90, 28.1f);
	}
}
