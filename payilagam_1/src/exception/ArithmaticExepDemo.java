package exception;

public class ArithmaticExepDemo {
	int name;

	public static void main(String[] args) {
		int a = 10;
		int b = 1;
		int c;
		ArithmaticExepDemo aed = null;
		try {
			c = a / b;
//			System.out.println(aed.name);
		} catch (ArithmeticException ae) {
			System.out.println("this is arithmatic exception");
			c = 1;
		}finally {
			System.out.println("this is finally block");
		}

		System.out.println("this is the last line" + c);

	}

}
