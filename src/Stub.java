

public class Stub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle ferarri = new Vehicle("2FST4U","Cherry Red",2,350);
		Vehicle honda = new Vehicle("2SLO4U","Blue",4,200);
		Bicycle bike = new Bicycle("SSD","RED",12, 1);
		Truck ford = new Truck("2FST4U","Cherry Red",2,350,35000);
		

		honda.printState();
		ferarri.printState();
	}

}
