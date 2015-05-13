/**
 * 
 */
package command;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public class StereoOffCommand implements Command {
	Stereo stereo;
	/**
	 * 
	 */
	public StereoOffCommand() {
		stereo = new Stereo();
	}

	/* (non-Javadoc)
	 * @see command.Command#execute()
	 */
	@Override
	public void execute() {
		stereo.off();

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.on();
	}

}
