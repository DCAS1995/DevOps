package Task_6;

public class Invoker {
	private Calculate calculate;
	
	public void setCalculate(Calculate calculate){
		this.calculate = calculate;
	}
	
	public void PaintCalculate(){
		calculate.execute();
	}
	
}	
