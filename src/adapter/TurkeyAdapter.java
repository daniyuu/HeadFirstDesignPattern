/**
 * 
 */
package adapter;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public class TurkeyAdapter implements Duck {
	Turkey turkey;

	/**
	 * 
	 */
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	/* (non-Javadoc)
	 * @see adapter.Duck#quack()
	 */
	@Override
	public void quack() {
		turkey.gobble();
	}

	/* (non-Javadoc)
	 * @see adapter.Duck#fly()
	 */
	@Override
	public void fly() {
		turkey.fly();
	}

}
