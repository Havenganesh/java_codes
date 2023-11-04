package stu_inheritance;

public class Children extends Student {
	String name;
	int age;
	int std;
	
	
	public Children() {
		super("hi");
		System.out.println("children constructor called second");
		name="child";
		age=1;
		std=1;
	}
	public Children(String name,int age) {
		this();
		this.age=age;
		this.name=name;
	}

	void studying() {
		System.out.println("studing super fast");
	}

	void listening() {
		System.out.println("children listening");
	}

	void palying() {
		System.out.println("playing");
	}

	void studyingWithEating() {
		this.studying();
		this.eating();
		super.listening();
	}

	void eating() {
		System.out.println("eating");
	}

	void drinking() {
		System.out.println("drinking");
	}

}
