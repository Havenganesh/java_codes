package abstrction;

public abstract class Vehicle {
	public Vehicle() {
		super();
		System.out.println("super class Vehicle Called");
	}
	abstract void start();

	abstract void  move();

	abstract void stop(String name);
	
	abstract void fuelType();
}
