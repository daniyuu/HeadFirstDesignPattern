/**
 * 
 */
package composite;

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
		MenuComponent pancakeHouseMenu = new Menu("pancakeHouseMenu","Breakfast");
		MenuComponent dinerMenu = new Menu("dinerMenu","Lunch");
		MenuComponent cafeMenu = new Menu("cafeMenu","Dinner");
		MenuComponent dessertMenu = new Menu("dessertMenu","dessert");
		
		MenuComponent allMenus = new Menu("ALL MENUS", "ALL menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		dinerMenu.add(new MenuItem(
				"Pasta",
				"Spaghetti with Marinara",
				true,
				3.89));
		
		dinerMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem(
				"Apple Pie",
				"Applie pie with a flakey crust", 
				true, 
				1.59)
				);
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}

}
