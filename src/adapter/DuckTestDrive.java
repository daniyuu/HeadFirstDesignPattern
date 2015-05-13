/**
 * 
 */
package adapter;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public class DuckTestDrive {

	/**
	 * 
	 */
	public DuckTestDrive() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("This Turkey says... ");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThis Duck says... ");
		testDuck(duck);
		
		System.out.println("\nThis TurkeyAdapter says... ");
		testDuck(turkeyAdapter);
		
		
	}
	
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}
