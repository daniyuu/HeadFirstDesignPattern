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
public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	
	MenuItem[] menuItems;
	
	/**
	 * 
	 */
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Hotdog","A hotdog with relish",true,3.05);
		
	}

	public void addItem(String name,String description,boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		//System.out.println("name == " + menuItem.getName());
		if(numberOfItems >= MAX_ITEMS){
			System.out.println("Sorry, menu is full!");
		}else{
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
		
	}
	
	public Iterator createIterator(){
		return new DinerMenuIterator(menuItems);
	}
	
}
