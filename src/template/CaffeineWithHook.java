/**
 * 
 */
package template;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class CaffeineWithHook extends CaffeineBeverageWithHook {

	/**
	 * 
	 */
	public CaffeineWithHook() {
		// TODO Auto-generated constructor stub
		
	}

	/* (non-Javadoc)
	 * @see template.CaffeineBeverageWithHook#addCondiments()
	 * 
	 */
	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		

	}

	/* (non-Javadoc)
	 * @see template.CaffeineBeverageWithHook#brew()
	 */
	@Override
	void brew() {
		// TODO Auto-generated method stub

	}
	// ∏≤∏«¡Àhook
	public boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		return false;
	}

}
