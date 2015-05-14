/**
 * 
 */
package iterator;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class MenuTestDrive {

	/**
	 * 
	 */
	public MenuTestDrive() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		waitress.printMenu();

	}

}
