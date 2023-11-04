package payilagam;

public class Loan {
	public Loan() {
		principleAmount=1000;
		rateOfInterest=12;
		numberOfyears=1;
	}
	int principleAmount;
	int rateOfInterest;
	int numberOfyears;
	int interestAmount;
	
	void calculateInterest() {
		interestAmount=(principleAmount*rateOfInterest*numberOfyears)/100;
	}
	

}
