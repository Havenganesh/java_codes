package inherit;

public class BoxDemo {
	public static void main(String[] args) {
		Box b1=new Box();
		b1.boxname();
		WeightBox w1=new WeightBox();
		w1.boxname();
		b1=w1;
		b1.boxname();
	
	}

}
