package recursion;

public class Recursive {
	public static void main(String[] args) {
		int value=recurseMethod(10);
		System.out.println(value);
	}
	
	static int recurseMethod(int no) {
		int no1=0;
		if(no>0) {
			no1=recurseMethod(no-1);
		}
		return no+no1;
	}

}
