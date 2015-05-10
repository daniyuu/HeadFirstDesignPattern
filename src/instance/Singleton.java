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
//	private static Singleton uniqueInstance;
	// 在静态初始化器中创建单例，这段代码保证了线程安全
	private static Singleton uniqueInstance = new Singleton();
	/**
	 * 构造器声明为私有的，只有singleton类内部才可以调用构造器
	 */
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	// 通过增加synchronized关键字到getinstance方法中，破事每个线程在进入这个方法之前买药先等候别的线程离开这个方法
//	public static synchronized Singleton getInstance(){
//		if(uniqueInstance == null){
//			uniqueInstance = new Singleton();
//		}
//		
//		return uniqueInstance;
//	}

	// 应用程序总是创建并使用单例模式，或者在创建和运行时方面的负担不太繁重 急切的想要创建此单间
	public static synchronized Singleton getInstance(){
		return uniqueInstance;
	}
}
