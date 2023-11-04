package payilagam;

public class PassByvalue {
	public static void main(String[] args) {
		//primitive variables
		int no=10;
		Remote r1=new Remote();
		
//		System.out.println("no value "+no);
		System.out.println("volume value "+r1.volume);
		
//		passByValue(no);
//		PassByRef(r1);
		
//		System.out.println("after no value "+no);
//		System.out.println("after volume value "+r1.volume);
	}
	static void passByValue(int number) {
		System.out.println(number+" int in the method");
		number=1000;
	}
	static void PassByRef(Remote remote) {
		System.out.println(remote+" remote in the method");
		remote.volume=100;
	}
	
	
	
}
