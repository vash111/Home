package ex01;

public class Cargoplane extends Plane {
	
	public Cargoplane() {}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName,fuelSize);
	}

	@Override
	public void flight(int distance) {
		int fuelConsumption = (distance / 10) * 50;
		setFuelSize(getFuelSize() - fuelConsumption);
		
	}
	
	

}
