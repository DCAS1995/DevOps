package Task_12;

public class Submarine extends Ship {

	public Submarine(int length, int x, int y, int orientation, int indicator) {
		super(length, x, y, orientation, indicator);
		this.setLength(length);
		this.setX(x);
		this.setY(y);
		this.setSymbol("S");
		this.setIndicator(indicator);
	}

}
