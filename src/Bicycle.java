
public class Bicycle extends Vehicle {

	private int _numberOfSeats = 0;
	
	public Bicycle(String plate, String colour, double maxVelocity, int numOfSeats) {
		super(plate, colour, 0, maxVelocity);
		// TODO Auto-generated constructor stub
		_numberOfSeats = numOfSeats;
	}

	@Override
	public void printState(){
		
		System.out.println("Speed: " + this._speed);
		System.out.println("Max Speed: " + this._maxSpeed);
		System.out.println("Colour: " + this._colour);
	 	System.out.println("Number of Seats: " + this._numberOfSeats);
		System.out.println("License Plate Number: " + this._licensePlateNumber);
		System.out.println();
	}
	
	
}