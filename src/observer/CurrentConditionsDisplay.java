/**
 * 
 */
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Daniyuu
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;

	
	public CurrentConditionsDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	
	/* (non-Javadoc)
	 * @see observer.DisplayElement#display()
	 */
	@Override
	public void display() {
		System.out.println("current conditions: " + temperature + "F degrees and " + humidity+ "% humidity");
	}



	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumiity();
			display();
		}
	}

}
