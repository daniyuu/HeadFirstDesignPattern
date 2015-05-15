/**
 * 
 */
package composite;

import java.util.Iterator;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class Waitress {
	MenuComponent allMenus;

	/**
	 * 
	 */
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void printMenu(){
		Iterator iterator = allMenus.createIterator();
		System.out.println("\nVEGETARIAN MENU\n---------");
		while(iterator.hasNext()){
			MenuComponent menuCompoent = (MenuComponent) iterator.next();
			try{
				if(menuCompoent.isVegetarian()){
					menuCompoent.print();
				}
			}catch(UnsupportedOperationException e){}
		}
	}

}
