package Task_12;

public abstract class Ship {
	int length;
	int x;
	int y;
	String symbol;
	boolean hit;
	int orientation;
	int indicator;
	
	public Ship(int length,int x, int y, int orientation, int indicator){
		this.length = length;
		this.x = x;
		this.y = y;
		this.orientation = orientation;
		this.indicator = indicator;
	}
	
	public int getLength(){
		return length;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getIndicator(){
		return indicator;
	}
	
	public String getSymbol(){
		return symbol;
	}
	
	public void setLength(int length){
		this.length = length;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	
	public void setIndicator(int indicator){
		this.indicator = indicator;
	}
}
