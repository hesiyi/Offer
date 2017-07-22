package Singleton;

/*
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
   getInstance() 的性能对应用程序很关键。
 */
public class Singleton4 {
	public static Singleton4 instance = null;

	private Singleton4() {

	}

	/**
	 * 线程不安全的，多个对象调用方法时，会产生不安全问题
	 * 
	 * @return
	 */
	public static Singleton4 getInstance() {
		if (instance == null) {
			synchronized (Singleton4.class) {
				if(instance==null){
			instance = new Singleton4();
		     }
		   }
		

	}
		return instance;
		}
}
