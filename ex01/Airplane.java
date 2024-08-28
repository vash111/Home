package ex01;

public class Airplane extends Plane {
	
	public Airplane() {}
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName,fuelSize);
	}
	
	@Override
	public void flight(int distance) {
		int fuelConsumption = (distance / 10) * 30;
		setFuelSize(getFuelSize() - fuelConsumption);
	}

	
	
}
