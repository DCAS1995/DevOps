package Task_6;

public class LeastWasteful implements Calculate {
	private Paint paint;
	private double area;
	
	public LeastWasteful(Paint paint, double area){
		this.paint = paint;
		this.area = area;
	}
	
	public void execute(){
		paint.FindPaintWaste(area, paint);
	}
}
