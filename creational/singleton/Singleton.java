package creational.singleton;

public class Singleton {

	private static Singleton singleton;
	private Singleton() {
		if(singleton!=null) {
			throw new RuntimeException("Use get Instance method() to create");
		}
	}
	
	public static Singleton getInstance() {
		if(singleton==null) {
			synchronized (Singleton.class) {
				if(singleton==null)
					singleton=new Singleton();
			}
		}
		return singleton;
	}
	
	public Object clone () throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public Object readResolve() {
		return getInstance();
	}
}
