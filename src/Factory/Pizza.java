/**
 * 
 */
package Factory;

import java.util.ArrayList;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public abstract class Pizza {
	String name;
	Dough dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	public Pizza(){
		
	}
	
	abstract void prepare();
	
	public void bake(){
		System.out.println("bake");
	}
	
	public void cut(){
		System.out.println("cut");
	}
	
	public void box(){
		System.out.println("box");
	}
	
	public String getName(){
		return name;
	}
}
