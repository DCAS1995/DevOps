package Task_5;

public class Car extends Vehicle {
	int numberOfDoors;
	double bootSize;
	int numberOfSeats;
	
	public Car(){
		
	}
	
	public Car(int ID, int wheels, String type, int year, int doors, double boot, int seats) {
		super(ID, wheels, type, year);
		// TODO Auto-generated constructor stub
		this.ID = ID;
		this.numberOfWheels = wheels;
		this.Type = type;
		this.year = year;
		this.numberOfDoors = doors;
		this.bootSize = boot;
		this.numberOfSeats = seats;
	}
	
	public int getNumberOfDoors(){
		return numberOfDoors;
	}
	
	public double getBootSize(){
		return bootSize;
	}
	
	public int getNumberOfSeats(){
		return numberOfSeats;
	}

}
