package Task_12;

public class Carrier extends Ship{

	public Carrier(int length, int x, int y, int orientation, int indicator) {
		super(length, x, y, orientation, indicator);
		this.setLength(length);
		this.setX(x);
		this.setY(y);
		this.setSymbol("C");
		this.setIndicator(indicator);
	}

}
