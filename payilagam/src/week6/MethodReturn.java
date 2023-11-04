package week6;

public class MethodReturn {

	public static void main(String[] args) {
		float result=circleArea(7.89f);
		System.out.println(result);

	}
	
	static float circleArea(float radius) {
		float area=3.14f*radius*radius;
		return area;
	}

}
