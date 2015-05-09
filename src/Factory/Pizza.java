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
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	public Pizza(){
		
	}
	
	public void prepare(){
		System.out.println("prepare");
	}
	
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
