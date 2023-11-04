package payilagam;

public class ClassModel {
	static String className="java";
	String objName="objName";
	public static void main(String[] args) {
	
		System.out.println(className);
		ClassModel obj1=new ClassModel();
		System.out.println(obj1.objName);
		
		ClassModel obj2=new ClassModel();
		obj2.objName="second object";
		System.out.println(obj2.objName);
		System.out.println(obj1.objName);
	}

}



//Box box1 =new Box();
//box1.bredth=25;
//box1.length=30;
//box1.height=50;
//Box box2=new Box();
//box2.bredth=100;
//System.out.println(box1.bredth);
//System.out.println(box2.bredth);
//
//Box.name="amozon box";
//Box.count=10;
//System.out.println(box1.name);
//box2.name="box2 changed this";
//System.out.println(Box.name);