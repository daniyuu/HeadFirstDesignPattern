/**
 * 
 */
package command;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;

	/**
	 * 
	 */
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	/* (non-Javadoc)
	 * @see command.Command#execute()
	 */
	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();

	}

	/* (non-Javadoc)
	 * @see command.Command#undo()
	 */
	@Override
	public void undo() {
		if(prevSpeed ==CeilingFan.HIGH){
			ceilingFan.high();
		}else if(prevSpeed ==CeilingFan.MEDIUM){
			ceilingFan.medium();
		}else if(prevSpeed ==CeilingFan.LOW){
			ceilingFan.low();
		}else if(prevSpeed ==CeilingFan.OFF){
			ceilingFan.off();
		}

	}

}