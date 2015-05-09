/**
 * 
 */
package Factory;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	/**
	 * 
	 */
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		dough = ingredientFactory.createDough();
		
	}

}
