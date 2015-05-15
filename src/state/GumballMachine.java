/**
 * 
 */
package state;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class GumballMachine {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	State noQuarterState;
	
	State state = noQuarterState;
	int count = 0;

	/**
	 * 
	 */
	public GumballMachine(int count) {
		noQuarterState = new NoQuarterState();
		this.count = count;
		if(count > 0){
			state = noQuarterState;
		}
	}

	public void insertQuarter(){
		state.insertQuerter();
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	
	}
	
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	
	public void dispense(){
		
	}
	
	void setState(State state){
		this.state = state;
	}
	
	
	
}
