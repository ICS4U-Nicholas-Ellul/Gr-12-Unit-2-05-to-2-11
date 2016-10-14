
public class Truck extends Vehicle {

	private double _storageSpace;
	private double _maxStorageSpace;
	
	public Truck(String plateNum, String colour, int numOfDoors, int maxSpeed, double trunkSpace) {
		// TODO Auto-generated constructor stub
		super(plateNum,colour,numOfDoors,maxSpeed);
		
		this._storageSpace = trunkSpace;
		this._maxStorageSpace = trunkSpace;
		
	}
	
	public void addToTrunk(double width, double length)
	{
		double volume = width * length;
		
		if(this._storageSpace >= volume){
			
			this._storageSpace -= volume;
			
			System.out.println("You have " + this._storageSpace + "m^3 remaining.");
			
		}else{
			
			System.out.println("You have insufficiant storage.");
		
		}
	}
	
	public void removeFromTrunk(double width, double length)
	{
		double volume = width * length;
		double amountOfItemsInTrunk = this._maxStorageSpace - this._storageSpace;
		if(amountOfItemsInTrunk <= volume){
			
			this._storageSpace -= volume;
			
			System.out.println("You have " + this._storageSpace + "m^3 remaining.");
			
		}else{
			
			System.out.println("You don't have that much to remove.");
		
		}
	}
	
	@Override
	public void printState(){
		
		System.out.println("Speed: " + this._speed);
		System.out.println("Max Speed: " + this._maxSpeed);
		System.out.println("Colour: " + this._colour);
		System.out.println("# of Doors: " + this._numberOfDoors);
		System.out.println("License Plate Number: " + this._licensePlateNumber);
		System.out.println("Storage space remaining: " + this._storageSpace);
		System.out.println("Max storage space: " + this._maxStorageSpace);
		System.out.println();
	}
}
