package Task_6;

import java.util.Scanner;

public class Client {
	public static void main(String[] args){
		Invoker invoker = new Invoker();
		Paint cheapoMax = new Paint("CheapoMax", 20, 10, 19.99);
		Paint averageJoes = new Paint("AverageJoes", 15, 11, 17.99);
		Paint duluxourous = new Paint("DuluxourousPaint", 10, 20, 25.0);
		Scanner scanner = new Scanner(System.in);
		double area = scanner.nextDouble();
		
		//Find the prices of each paint to cover the entire area
		Calculate cheapoPrice = new Cheapest(cheapoMax, area);
		Calculate averagePrice = new Cheapest(averageJoes, area);
		Calculate duluxourousPrice = new Cheapest(duluxourous, area);
		
		//Find the amount of waste from each paint when covering the area
		Calculate cheapoWaste = new LeastWasteful(cheapoMax, area);
		Calculate averageWaste = new LeastWasteful(averageJoes, area);
		Calculate duluxourousWaste = new LeastWasteful(duluxourous, area);
		
		
		//Run the methods to find the three prices to cover the area
		invoker.setCalculate(cheapoPrice);
		invoker.PaintCalculate();
		
		invoker.setCalculate(averagePrice);
		invoker.PaintCalculate();
		
		invoker.setCalculate(duluxourousPrice);
		invoker.PaintCalculate();
		
		
		//Run the methods to find the waste from each paint when covering the area
		invoker.setCalculate(cheapoWaste);
		invoker.PaintCalculate();
		
		invoker.setCalculate(averageWaste);
		invoker.PaintCalculate();
		
		invoker.setCalculate(duluxourousWaste);
		invoker.PaintCalculate();
		
		scanner.close();
		
	}
}
