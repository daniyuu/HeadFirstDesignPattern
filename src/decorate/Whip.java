/**
 * 
 */
package decorate;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public class Whip extends CondimentDecorator {
	Beverage beverage;
	/**
	 * 
	 */
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	/* (non-Javadoc)
	 * @see decorate.CondimentDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
	
	public double cost(){
		return 0.30 + beverage.cost();
	}

}
