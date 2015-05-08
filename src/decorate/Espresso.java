/**
 * 
 */
package decorate;

/** 
 * @author Daniyuu
 * @see 
 * @version 
 */
public class Espresso extends Beverage {

	/**
	 * 
	 */
	public Espresso() {
		description =  "Espresso";
	}

	/* (non-Javadoc)
	 * @see decorate.Beverage#cost()
	 */
	@Override
	public double cost() {
		return 1.99;
	}

}
