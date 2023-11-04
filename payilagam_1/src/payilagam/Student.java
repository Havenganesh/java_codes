package payilagam;

public class Student {
	String name;
	int age;
	int rollNumber;
	boolean pass;
	char section;
//default constructor
	Student() {
	}
	//constructor overloading
	Student(String name1,int age1,int rollNo) {
		name=name1;
		age=age1;
		rollNumber=rollNo;
	}

	public static void main(String[] args) {
		Student stu1 = new Student();
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		System.out.println(stu1.section);
		System.out.println(stu1.pass);
//		Student stu2=new Student("Dinesh", 21, 03);
//		System.out.println("student : "+stu2.name);
//		Student stu3=new Student("poovarasan", 21, 03);
//		System.out.println("student : "+stu3.name);
	}

	// method overloading
	void studying() {
		System.out.println("student was studying");
	}

	int studyingInt() {
		System.out.println("student was studying");
		return 0;
	}

	String studying(String book) {
		System.out.println("student is studying this " + book);
		return book;
	}

	void studying(int bookNo) {
		System.out.println("stududent is studying this No book : " + bookNo);
	}

	void studying(String book1, String book2) {
		System.out.println("stududent is studying this two books : " + book1 + "   " + book2);
	}

}
