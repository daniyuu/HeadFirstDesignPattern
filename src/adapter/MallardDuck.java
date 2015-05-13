/**
 * 
 */
package adapter;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public class MallardDuck implements Duck {

	/**
	 * 
	 */
	public MallardDuck() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see adapter.Duck#quack()
	 */
	@Override
	public void quack() {
		System.out.println("Quack");
	}

	/* (non-Javadoc)
	 * @see adapter.Duck#fly()
	 */
	@Override
	public void fly() {
		System.out.println("i'm flying");
	}

}
