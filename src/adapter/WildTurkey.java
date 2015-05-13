/**
 * 
 */
package adapter;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public class WildTurkey implements Turkey {

	/**
	 * 
	 */
	public WildTurkey() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see adapter.Turkey#gobble()
	 */
	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	/* (non-Javadoc)
	 * @see adapter.Turkey#fly()
	 */
	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}

}
