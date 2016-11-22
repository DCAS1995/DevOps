package Task_12;

public class Battleship extends Ship{

	public Battleship(int length, int x, int y, int orientation, int indicator) {
		super(length, x, y, orientation, indicator);
		this.setLength(length);
		this.setX(x);
		this.setY(y);
		this.setSymbol("B");
		this.setIndicator(indicator);
	}

}
