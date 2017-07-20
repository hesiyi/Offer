package Singleton;
//饿汉模式
public class Singleton {
	public static final Singleton instance=new Singleton();
	
	private Singleton(){
		
	}
	/**
	 * 線程不安全
	 * @return
	 */
	public static Singleton getInstance(){
		return instance;
	}
	/**
	 * 
	 * @return
	 */
	public static synchronized Singleton getInstance1(){
		return instance;
	}

}
