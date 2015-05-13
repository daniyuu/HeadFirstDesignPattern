/**
 * 
 */
package template;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public abstract class AbstractClass {

	/**
	 * 
	 */
	public AbstractClass() {
		// TODO Auto-generated constructor stub
	}
	
	final void templateMethod(){
		primitiveOperation1();
		primitiveOperation2();
		concreteOperation();
		hook();
	}
	
	abstract void primitiveOperation1();
	
	abstract void primitiveOperation2();
	
	final void concreteOperation(){
		
	}
	
	void hook(){}

}
