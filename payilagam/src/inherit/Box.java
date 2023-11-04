package inherit;

public class Box {
	int width;
	int breadth;
	int height;
	static String name;
	
	Box(){
		this(3);
	}
	Box(int a){
	}
	void getHeight() {
		System.out.println(height);
		this.getHeight();
		this.boxname();
	}
	static void boxname() {
		System.out.println("Box");
	}
	

}
