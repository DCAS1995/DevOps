package Task_12;

import java.util.List;

public class Grid {
	int[][] grid;
	int size;
	
	public Grid(int size){
		this.size = size;
		this.grid = new int[size][size];
	}
	
	public void initGrid(List<Ship> ship){
		for(int row = 0; row<size; row++){
			for(int col = 0; col<size; col++){
				for (int i = 0; i<ship.size(); i++){
					if(row >= ship.get(i).getY() - 1 && 
							row < (ship.get(i).getY() + ship.get(i).getLength()) - 1 && col == ship.get(i).getX() - 1){
							
						grid[row][col] = ship.get(i).getIndicator();
						break;
					}
					else{
						grid[row][col] = 0;
					}

				}
			}
		}
	}
	
	public void DrawGrid(List<Ship> ship){
		System.out.println();
		for (int i = 0; i<size; i++){
			System.out.print("\t" + (i+1));
		}
		System.out.println();
		
		for (int row = 0; row < size; row++){
			System.out.print((row+1)+"");
			for (int col = 0; col < size; col++){
				if(grid[row][col] == 0){
					System.out.print("\t" + "#");
				}
				else if(grid[row][col] == 1){
					System.out.print("\t" + "O");
				}
				else if (grid[row][col] == 2){
					System.out.print("\t" + "X");
				}
				else{
					for (int i=0; i<ship.size(); i++){
						if (grid[row][col] == ship.get(i).getIndicator()){
							System.out.print("\t" + ship.get(i).getSymbol());
							break;
						}
					}
				}
			}
			System.out.println();
		}
	}
	
}
