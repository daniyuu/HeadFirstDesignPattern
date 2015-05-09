/**
 * 
 */
package Factory;

/**
 * @author daniyuu
 * @see 
 * @version 
 * 
 * creator �������࣬��������һ������Ĺ�������
 */
public abstract class PizzaStore {

	/**
	 * 
	 */
	public PizzaStore() {
	}
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		
		//ʵ���ϲ���֪�����ĸ�����μ��˽��� ����
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	// ������������������Ϊ�ǳ����࣬����ÿ�����඼����ʵ���������
	protected abstract Pizza createPizza(String type);

}
