package Task_5;

public class Lorry extends Vehicle{
	double capacity;
	
	
	public Lorry(){
		
	}

	public Lorry(int ID, int wheels, String type, int year, double capacity) {
		super(ID, wheels, type, year);
		this.ID = ID;
		this.numberOfWheels = wheels;
		this.Type = type;
		this.year = year;
		this.capacity = capacity;
	}
	
	public double getCapacity(){
		return capacity;
	}

}
