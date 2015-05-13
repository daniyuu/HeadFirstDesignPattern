/**
 * 
 */
package command;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public class LightOffCommand implements Command {

	Light light;
	/**
	 * 
	 */
	public LightOffCommand(Light light) {
		this.light = light;
	}

	/* (non-Javadoc)
	 * @see command.Command#execute()
	 */
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
		
	}

}
