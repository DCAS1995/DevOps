package Task_5;

public abstract class Vehicle {
	int ID;
	int numberOfWheels;
	String Type;
	int year;
	
	public Vehicle(){
		
	}
	
	public Vehicle(int ID, int wheels, String type, int year){
		this.ID = ID;
		this.numberOfWheels=wheels;
		this.Type = type;
		this.year = year;
	}
	
	public int getID(){
		return ID;
	}
	
	public int getNumberOfWheels(){
		return numberOfWheels;
	}
	
	public String getType(){
		return Type;
	}
	
	public int getYear(){
		return year;
	}
}
