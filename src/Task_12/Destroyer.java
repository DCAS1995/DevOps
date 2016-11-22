package Task_12;

public class Destroyer extends Ship{

	public Destroyer(int length, int x, int y, int orientation, int indicator) {
		super(length, x, y, orientation, indicator);
		this.setLength(length);
		this.setX(x);
		this.setY(y);
		this.setSymbol("D");
		this.setIndicator(indicator);
	}

}
