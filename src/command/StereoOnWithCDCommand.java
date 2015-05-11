/**
 * 
 */
package command;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
	
	/**
	 * 
	 */
	public StereoOnWithCDCommand() {
		stereo = new Stereo();
	}

	/* (non-Javadoc)
	 * @see command.Command#execute()
	 */
	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.off();
	}

}
