package interfaceStaticChecck;

public class Idemo {

	public static void main(String[] args) {
		Caller call= new ClassModel();
		call.callerOne();
		Caller.methodProvider();
		
		System.out.println(Caller.NO);

		
	}
}
