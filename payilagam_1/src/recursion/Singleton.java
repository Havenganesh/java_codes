package recursion;

public class Singleton {
	private static Singleton s1;
	private Singleton() {
	}

	public static Singleton newSingleton() {
		if(s1==null) {
			s1=new Singleton();
		}
		return s1;
	}

}
