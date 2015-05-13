/**
 * 
 */
package template;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class Coffee extends CaffeineBeverage {

	/**
	 * 
	 */
	public Coffee() {
		// TODO Auto-generated constructor stub
	}


	@Override
	void addCondiments() {
		System.out.println("Adding Sugar and Milk");
		
	}

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
		
	}

}
