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
	 * ����������Ϊ˽�еģ�ֻ��singleton���ڲ��ſ��Ե��ù�����
	 */
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	// ͨ������synchronized�ؼ��ֵ�getinstance�����У�����ÿ���߳��ڽ����������֮ǰ��ҩ�ȵȺ����߳��뿪�������
	public static synchronized Singleton getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		
		return uniqueInstance;
	}

}
