package payilagam;

public class ScopeOfVariable {

	

	public static void main(String[] args) {
		// local variable
		int amount = 1000;
		int nOfY = 1;
		int rateOfI = 12;
		System.out.println("amount " + amount);	
		int intereset = interest(amount, nOfY,rateOfI );
		System.out.println(intereset);
	}
	
	static int interest(int principle, int year, int rate) {
//		int amount;
//		System.out.println("amount "+amount);
		System.out.println("this is rate "+rate);
		int interest = (principle * year) * (rate / 100);
		return interest;
	}

}
