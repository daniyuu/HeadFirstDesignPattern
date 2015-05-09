/**
 * 
 */
package Factory;

/**
 * @author daniyuu
 * @see 
 * @version 
 * 
 * creator 创建者类，他定义了一个抽象的工厂方法
 */
public abstract class PizzaStore {

	/**
	 * 
	 */
	public PizzaStore() {
	}
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		
		//实际上并不知道是哪个对象参加了进来 解耦
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	// 允许子类做决定，因为是抽象类，所以每个子类都必须实现这个方法
	protected abstract Pizza createPizza(String type);

}
