package Task_6;

public class Paint {
	String name;
	int capacity;
	int coverage;
	double price;
	
	public Paint(String name, int capacity, int coverage, double price){
		this.name = name;
		this.capacity = capacity;
		this.coverage = coverage;
		this.price = price;
	}
	
	public void FindPaintPrice(double area, Paint paint){
		double paintprice = Math.ceil(area/(double)(paint.coverage*paint.capacity)) * paint.price;
		
		System.out.println(paintprice);;
	}
	
	public void FindPaintWaste(double area, Paint paint){
		double paintwaste = area%(double)(paint.coverage*paint.capacity);
		
		System.out.println(paintwaste);;
	}
	
}
