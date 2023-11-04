package payilagam;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int no=8973798;
		int copy=no;
		System.out.println("this is Original Number : "+no);
		int reverseno=0;
		while(no>0) {
			int lastdigit=no%10;
			no=no/10;
			reverseno=reverseno*10+lastdigit;
			System.out.println("while no : "+no);
			System.out.println("while reverse : "+reverseno);
		}
		System.out.println("this is Reverse Number  : "+reverseno);
		System.out.println("this no : "+no+" this reversno : "+reverseno);
		if(copy==reverseno) {
			System.out.println("this is palindrome");
		}else {
			System.out.println("this is not palindrome");
		}
	}

}
