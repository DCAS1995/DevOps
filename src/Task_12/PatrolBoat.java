package Task_12;

public class PatrolBoat extends Ship {

	public PatrolBoat(int length, int x, int y, int orientation, int indicator) {
		super(length, x, y, orientation, indicator);
		this.setLength(length);
		this.setX(x);
		this.setY(y);
		this.setSymbol("P");
		this.setIndicator(indicator);
	}
	
}	
