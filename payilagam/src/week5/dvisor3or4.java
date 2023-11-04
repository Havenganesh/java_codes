package week5;

public class dvisor3or4 {

	public static void main(String[] args) {
		int givenNumber=25;
		if(givenNumber%3==0 && givenNumber%4==0) {
			System.out.println(givenNumber+" : this is divided by 3 and 4");
		}else if(givenNumber%3==0) {
			System.out.println("this is divided by 3 only");
		}else if(givenNumber%4==0) {
			System.out.println("this is only divided by 4 only");
		}else {
			System.out.println("this is not divided by both");
		}

	}

}
