package week6;

public class GretestCommonDivisor {

	public static void main(String[] args) {
		int a=12;
		int b=9;
		int smallNumber=a<b?a:b;
		int GCD=1;
		for(int i=1;i<smallNumber;i++) {
			if(a%i==0&&b%i==0) {
				GCD=i;
			}
		}
		System.out.println(GCD);

	}

}
