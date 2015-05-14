/**
 * 
 */
package iterator;

import java.util.ArrayList;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class PancakeHouseMenu {
	ArrayList menuItems;
	/**
	 * 
	 */
	public PancakeHouseMenu() {
		// TODO Auto-generated constructor stub
		menuItems = new ArrayList();
		
		addItem("K&B's Pancake BreakFast","Pancake with eggs",true,2.99);
	}

	public void addItem(String name,String description,boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
		
	}
	
	public Iterator createIterator(){
		return new PancakeHouseIterator(menuItems);
	}
}
