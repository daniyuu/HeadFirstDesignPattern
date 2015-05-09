/**
 * 
 */
package Factory;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class ChicagoStyleCheesePizza extends CheesePizza {

	public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
		super(ingredientFactory);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	
	public void cut(){
		System.out.println("Cutting the Pizza into square slices");
	}

}
