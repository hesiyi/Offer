package Singleton;

//懒汉模式(有两种懒汉模式)
/**
 * 1.线程安全的 2.线程不安全的
 * 
 * @author 49005
 *
 */
public class Singleton2 {
	public static Singleton2 instance = null;

	private Singleton2() {

	}

	/**
	 * 线程不安全的，多个对象调用方法时，会产生不安全问题
	 * 
	 * @return
	 */
	public static Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;

	}

	/**
	 * 线程安全的
	 */
	public static synchronized Singleton2 getInstance1() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}

}
