package ex01;

public class PlaneTest {

	public static void main(String[] args) {
		
		Plane[] planes = new Plane[2];
		
		planes[0] = new Airplane("L747",1000);
		planes[1] = new Cargoplane("C40",1000);
		
		printInfo(planes);
		
		System.out.println("100씩 운항");
		for(Plane plane : planes) {
			plane.flight(100);
		}
		printInfo(planes);
	
		System.out.println("200L 주유");
		for(Plane plane : planes) {
			plane.refuel(200);
		}
		printInfo(planes);
	
	}

	public static void printInfo(Plane[] planeList) {
		System.out.println("Plane" + "       fuelSize");
		System.out.println("----------------------");
		for (Plane paperplane :planeList) {
			System.out.println(paperplane.getPlaneName()+"       "+paperplane.getFuelSize());
		}
	}
	
}
