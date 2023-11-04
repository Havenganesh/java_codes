package inherit;

public class WeightBox extends Box {
	int weight;
	
	void getWeight() {
		System.out.println(weight);
		super.boxname();
	}
	
	static void boxname() {
		System.out.println("weight box");
	}

}
