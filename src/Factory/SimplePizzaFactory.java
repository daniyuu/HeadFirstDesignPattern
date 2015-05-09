/**
 * 
 */
package Factory;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class SimplePizzaFactory {
	public Pizza createPizza(String type){
		Pizza pizza = null;
		
		if(type.equals("cheese")){
			
		}else if(type.equals("clam")){
			pizza = new ClamPizza();
		}else if(type.equals("veggie")){
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}
}
