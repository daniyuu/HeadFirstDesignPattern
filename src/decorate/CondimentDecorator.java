/**
 * 
 */
package decorate;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
	/**
	 * 
	 */
	public CondimentDecorator() {
	}

	/* (non-Javadoc)
	 * @see decorate.Beverage#cost()
	 */
	@Override
	public double cost() {
		return 0;
	}

}
