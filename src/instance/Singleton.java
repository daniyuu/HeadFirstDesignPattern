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
	// �ھ�̬��ʼ�����д�����������δ��뱣֤���̰߳�ȫ
	private static Singleton uniqueInstance = new Singleton();
	/**
	 * ����������Ϊ˽�еģ�ֻ��singleton���ڲ��ſ��Ե��ù�����
	 */
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	// ͨ������synchronized�ؼ��ֵ�getinstance�����У�����ÿ���߳��ڽ����������֮ǰ��ҩ�ȵȺ����߳��뿪�������
//	public static synchronized Singleton getInstance(){
//		if(uniqueInstance == null){
//			uniqueInstance = new Singleton();
//		}
//		
//		return uniqueInstance;
//	}

	// Ӧ�ó������Ǵ�����ʹ�õ���ģʽ�������ڴ���������ʱ����ĸ�����̫���� ���е���Ҫ�����˵���
	public static synchronized Singleton getInstance(){
		return uniqueInstance;
	}
}
