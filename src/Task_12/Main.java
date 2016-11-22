package Task_12;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		Grid grid = new Grid(12);
		List<Ship> ships = new ArrayList<Ship>();
		
		PatrolBoat pb = new PatrolBoat(2, 1, 1, 0, 4);
		ships.add(pb);
		
		PatrolBoat pb2 = new PatrolBoat(2, 4, 2, 0, 4);
			if(ValidatePlacement(ships, pb2)){
				ships.add(pb2);
		}
		
		Battleship bs = new Battleship(3, 4, 5, 0, 5);
		if(ValidatePlacement(ships,bs)){
			ships.add(bs);
		}
		
		Submarine sub = new Submarine(3, 7, 6, 0, 6);
		if(ValidatePlacement(ships,sub)){
			ships.add(sub);
		}
		
		grid.initGrid(ships);
		grid.DrawGrid(ships);
			

		
		
	}
	
	public static boolean ValidatePlacement(List<Ship> ships, Ship ship){
		boolean valid = true;
		
		for (int i = 0; i < ships.size(); i++){
			if (ship.getX() == ships.get(i).getX() && ship.getY() == ships.get(i).getY()){
				valid = false;
			}
			else {
				valid = true;
			}
		}
		
		return valid;
		
	}
}
