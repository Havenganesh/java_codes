package week5;

public class DivisorOfGivenNumber {

	public static void main(String[] args) {
		int givenNumber=60;
		int no=1;
		int count=0;
		while(no<givenNumber) {
			if(givenNumber%no==0) {
				count++;
				System.out.println(no+" is divisor of givenNumber "+givenNumber);
			}
			no++;
		}
		System.out.println("count of divisor : "+ count);

	}

}
