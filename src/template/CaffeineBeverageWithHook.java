/**
 * 
 */
package template;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public abstract class CaffeineBeverageWithHook {

	/**
	 * 
	 */
	public CaffeineBeverageWithHook() {
		// TODO Auto-generated constructor stub
	}
	
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
		
	}

	
	boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		return true;
	}

	abstract void addCondiments();	
	

	void pourInCup() {
		// TODO Auto-generated method stub
		System.out.println("Pouring into cup");
	}

	abstract void brew();

	void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("Boiling water");
	}

}
