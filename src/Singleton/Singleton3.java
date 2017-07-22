package Singleton;

/**
 * 內部
 * 
 * @author 49005
 *
 */
public class Singleton3 {
	private  static class SingletonHolder{
		private static final Singleton3 intance=new Singleton3();
	}
	private Singleton3(){
		
	}
	public static Singleton3 getInstance(){
		return SingletonHolder.intance;
	}
}
