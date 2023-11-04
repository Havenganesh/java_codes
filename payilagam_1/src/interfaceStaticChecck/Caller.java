package interfaceStaticChecck;

public interface Caller {
	

	void caller();
	
	default void callerOne() {//this is the common for all the classes
		System.out.println("this is callerOne from interface");
	}
	
	int NO=10;//this is a constant
	static void methodProvider() {// this is a standalone method
		System.out.println("this is method provider");
	}
}
