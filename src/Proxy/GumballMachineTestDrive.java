/**
 * 
 */
package Proxy;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class GumballMachineTestDrive {

	/**
	 * 
	 */
	public GumballMachineTestDrive() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		count = 5;
		GumballMachine gumballMachine = new GumballMachine("location",count);
		GumballMonitor monitor =  new GumballMonitor(gumballMachine);
		
		monitor.report();

	}

}
