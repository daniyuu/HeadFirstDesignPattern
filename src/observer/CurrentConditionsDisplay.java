/**
 * 
 */
package observer;

/**
 * @author Daniyuu
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	
	/* (non-Javadoc)
	 * @see observer.DisplayElement#display()
	 */
	@Override
	public void display() {
		System.out.println("current conditions: " + temperature + "F degrees and " + humidity+ "% humidity");
	}

	/* (non-Javadoc)
	 * @see observer.Observer#update(float, float, float)
	 */
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub

	}

}
