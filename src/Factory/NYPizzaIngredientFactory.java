/**
 * 
 */
package Factory;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	/**
	 * 
	 */
	public NYPizzaIngredientFactory() {
		
	}

	/* (non-Javadoc)
	 * @see Factory.PizzaIngredientFactory#createDough()
	 */
	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	/* (non-Javadoc)
	 * @see Factory.PizzaIngredientFactory#createSauce()
	 */
	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Factory.PizzaIngredientFactory#createCheese()
	 */
	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Factory.PizzaIngredientFactory#createVeggies()
	 */
	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Factory.PizzaIngredientFactory#createPepperoni()
	 */
	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Factory.PizzaIngredientFactory#createClam()
	 */
	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return null;
	}

}
