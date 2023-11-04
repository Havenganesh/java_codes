package payilagam;

public class Bank {

	static String name;
	public static void main(String[] args) {
		Loan l1=new Loan();
		System.out.println(l1.interestAmount);
//		findInterest(l1);
//		System.out.println(l1.interestAmount);
		findInterest(l1.principleAmount, l1.rateOfInterest, l1.numberOfyears);

	}
	
	static void findInterest(Loan loan ) {
		loan.interestAmount=loan.principleAmount*loan.rateOfInterest*loan.numberOfyears/100; 
	}
	
	static int findInterest(int principle,int rate,int noOfY) {
		int interest=principle*rate*noOfY/100;
		return interest;
	}

}
