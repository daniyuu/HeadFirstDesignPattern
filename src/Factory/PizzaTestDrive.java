/**
 * 
 */
package Factory;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class PizzaTestDrive {

	/**
	 * 
	 */
	public PizzaTestDrive() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("ordered a pizza that :" + pizza.getName());
	}

}
