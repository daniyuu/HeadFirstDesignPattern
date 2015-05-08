/**
 * 
 */
package decorate;

/** 
 * @author Daniyuu
 * @see 
 * @version 
 */
public class HouseBlend extends Beverage {

	/**
	 * 
	 */
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	/* (non-Javadoc)
	 * @see decorate.Beverage#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.89;
	}

}
