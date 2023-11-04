package abstrction;

public class PetrolCar extends Car{
	public PetrolCar() {
		super();
		System.out.println("petrol car called");
	}
	@Override
	void fuelType() {
		System.out.println("this is petrol");
		
	}

}
