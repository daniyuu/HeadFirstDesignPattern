/**
 * 
 */
package command;

/**
 * @author Daniyuu
 * @see 
 * @version 
 */
public class Stereo {

	/**
	 * 
	 */
	public Stereo() {
		// TODO Auto-generated constructor stub
	}
	
	public void off(){
		System.out.println("stereo is off");
	}
	
	public void on(){
		System.out.println("stereo is on");
	}
	
	public void setCD(){
		System.out.println("setCD");
	}
	
	public void setVolume(int vol){
		System.out.println("volume == " + vol);
	}

}
