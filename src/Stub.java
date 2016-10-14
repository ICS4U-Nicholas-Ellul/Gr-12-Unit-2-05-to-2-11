/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Oct 2016
 * This program is the stub program that runs the vehicle class.
 * 
 ****************************************************************************/

public class Stub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle ferarri = new Vehicle("2FST4U","Cherry Red",2,350);
		Vehicle honda = new Vehicle("2SLO4U","Blue",4,200);
		Bicycle bike = new Bicycle("SSD","RED",12, 1,2);
		Truck ford = new Truck("2FST4U","Cherry Red",2,350,35000);
		

		honda.printState();
		ferarri.printState();
	}

}
