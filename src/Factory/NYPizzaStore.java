/**
 * 
 */
package Factory;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class NYPizzaStore extends PizzaStore {

	/**
	 * @param factory
	 */
	public NYPizzaStore() {

	}

	/* (non-Javadoc)
	 * @see Factory.PizzaStore#createPizza(java.lang.String)
	 * 
	 * 真正的工厂方法
	 */
	@Override
	protected
	Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		}else if(type.equals("clam")){
			return new NYStyleClamPizza();
		}else if(type.equals("veggie")){
			return new NYStyleVeggiePizza();
		}
		return null;
	}

}
