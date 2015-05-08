/**
 * 
 */
package decorate;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public class DarkRoast extends Beverage {

	/**
	 * 
	 */
	public DarkRoast() {
		description = "DarkRoast";
	}

	/* (non-Javadoc)
	 * @see decorate.Beverage#cost()
	 */
	@Override
	public double cost() {
		return 0.90;
	}

}
