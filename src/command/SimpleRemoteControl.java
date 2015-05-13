/**
 * 
 */
package command;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public class SimpleRemoteControl {
	Command slot;

	/**
	 * 
	 */
	public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
	}
	
	public void setCommand(Command command){
		slot = command;
	}
	
	public void buttonWasPressed(){
		slot.execute();
	}

}
