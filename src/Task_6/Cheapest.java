package Task_6;

public class Cheapest implements Calculate{
	private Paint paint;
	private double area;
	
	public Cheapest(Paint paint, double area){
		this.paint = paint;
		this.area = area;
	}
	
	public void execute(){
		paint.FindPaintPrice(area, paint);
	}
}
