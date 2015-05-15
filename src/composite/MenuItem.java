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
public class MenuItem extends MenuComponent {
	String name;
	String description;
	boolean vegetarian;
	double price;

	/**
	 * 
	 */
	public MenuItem(String name,
					String description,
					boolean vegetarian,
					double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public double getPrice(){
		return price;
	}
	
	public boolean isVegetarian(){
		return vegetarian;
	}
	
	public void print(){
		System.out.println(" " + getName() );
		if(isVegetarian()){
			System.out.println("(v)");
		}
		
		System.out.println(", " + getPrice());
		System.out.println("        --- " + getDescription());
	}

	public Iterator createIterator(){
		return new NullIterator();
	}
}
