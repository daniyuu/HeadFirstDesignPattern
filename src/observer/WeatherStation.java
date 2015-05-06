/**
 * 
 */
package observer;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public class WeatherStation {

	/**
	 * 
	 */
	public WeatherStation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 33.4f);
		weatherData.setMeasurements(78, 90, 37.6f);
		
	}

}
