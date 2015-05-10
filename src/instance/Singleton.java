/**
 * 
 */
package instance;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class Singleton {
	private static Singleton uniqueInstance;
	/**
	 * 构造器声明为私有的，只有singleton类内部才可以调用构造器
	 */
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	// 通过增加synchronized关键字到getinstance方法中，破事每个线程在进入这个方法之前买药先等候别的线程离开这个方法
	public static synchronized Singleton getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		
		return uniqueInstance;
	}

}
