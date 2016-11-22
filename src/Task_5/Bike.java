package Task_5;

public class Bike extends Vehicle {
	int engineCapacity;
	
	public Bike(){
		
	}

	public Bike(int ID, int wheels, String type, int year, int engineCapacity) {
		super(ID, wheels, type, year);
		this.ID = ID;
		this.numberOfWheels = wheels;
		this.Type = type;
		this.year = year;
		this.engineCapacity = engineCapacity;
	}
	
	public int getEngineCapacity(){
		return engineCapacity;
	}

}
