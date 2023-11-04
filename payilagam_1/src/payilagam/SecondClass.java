package payilagam;

public class SecondClass {

	public static void main(String[] args) {
		System.out.println("this is starting");
		int time = 5;
		if (time < 6) {
			movieWatching();// method call
			System.out.println("movie ended");
		}
		System.out.println("this is ending");
		String food=foodOrdering(100);//method call
		System.out.println(food);

	}

	static  void movieWatching() {
		System.out.println("just watching the movie");
	}
	static int returnInt(int value) {
		return value;
	}
	static String foodOrdering(int amount) {
		
		if(amount==150) {
			return "Briyani";
		}else if(amount==120) {
			return "Fried Rice";
		}
		
		return "please give correct change";
	}
	

}
