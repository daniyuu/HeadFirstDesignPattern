/**
 * 
 */
package command;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public class RemoteControlTest {

	/**
	 * 
	 */
	public RemoteControlTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		

	}

}
