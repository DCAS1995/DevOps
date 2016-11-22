package Task_5;

import java.util.List;
import java.util.ArrayList;

public class Garage {
	
	List<Vehicle> Garage = new ArrayList<>();
	
	void AddVehicle(Vehicle vehicle){
		Garage.add(vehicle);
	}
	
	void RemoveVehicleID(int ID){
		for (int i=0; i<Garage.size(); i++){
			if (Garage.get(i).ID == ID){
				Garage.remove(Garage.get(i));
			}
		}	
	}
	
	void RemoveVehicleType(String type){
		for (int i=0; i<Garage.size(); i++){
			if (Garage.get(i).Type == type){
				Garage.remove(Garage.get(i));
			}
		}
	}
	
	void EmptyGarage(){
		for (int i=0; i<Garage.size(); i++){
			Garage.remove(Garage.get(i));
		}
	}
	
	double CostOfFixing(Vehicle vehicle){
		double cost = 0;
		if (vehicle.Type == "car"){
			cost = FixCar((Car)vehicle);
		}
		else if (vehicle.Type == "bike"){
			cost = FixBike((Bike)vehicle);
		}
		else{
			cost = FixLorry((Lorry)vehicle);
		}
		
		return cost;	
	}
	
	double FixCar (Car car){
		double cost = 30.0;
		
		cost*= car.numberOfWheels;
		
		if (car.numberOfDoors >3){
			cost*=1.5;
		}
		
		switch(car.numberOfSeats){
		
		case 2:
			if (car.bootSize > 20.0){
				cost*=2.5;
			}
			else{
				cost*=1.5;
			}
		case 5:
			if (car.bootSize > 50.0){
				cost*=2.5;
			}
			else{
				cost*=2.0;
			}
		case 7:
			if (car.bootSize > 70.0){
				cost*=3.0;
			}
			else{
				cost*=2.0;
			}		
		}
		
		return cost;
	}
	
	double FixBike (Bike bike){
		double cost = 15.0;
		
		if (bike.getEngineCapacity()>100 && bike.getEngineCapacity()<=300){
			cost*=1.5;
		}
		else if(bike.getEngineCapacity()>300 && bike.getEngineCapacity()<=500){
			cost*=2.5;
		}
		else if (bike.getEngineCapacity()>500 && bike.getEngineCapacity()<=1000){
			cost*=3.0;
		}
		else if (bike.getEngineCapacity()>1000){
			cost*=5.0;
		}
		
		return cost;
	}
	
	double FixLorry (Lorry lorry){
		double cost = 50;
		
		if (lorry.getCapacity() > 300.0 && lorry.getCapacity() <= 550.0){
			cost*=5.0;
		}
		else if (lorry.getCapacity() > 550.0){
			cost*=7.0;
		}
		
		return cost;
	}
	
	
}
