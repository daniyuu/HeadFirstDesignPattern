/**
 * 
 */
package command;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public class LightOnCommand implements Command {
	Light light;
	/**
	 * 
	 */
	public LightOnCommand(Light light) {
		this.light = light;
	}

	/* (non-Javadoc)
	 * @see command.Command#execute()
	 */
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
		
	}

}
