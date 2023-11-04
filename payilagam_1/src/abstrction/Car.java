package abstrction;

public abstract class Car extends Vehicle {
	public Car() {
		super();
		System.out.println("car called");
	}

	void start() {
		System.out.println("car statring");
	}

	void move() {
		System.out.println("car moving");
	}

	void FourWheeler() {
		System.out.println("this is a four wheeler");
	}

	void stop(String action) {
		System.out.println("this is the action " + action);
	}

}
