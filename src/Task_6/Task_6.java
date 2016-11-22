package Task_6;
import java.util.Scanner;

public class Task_6 {
	
	public static void main(String[] args){
		System.out.println("What are you trying to calculate?");
		System.out.println("(1) Cheapest paint?");
		System.out.println("(2) Least wasteful paint?");
		Scanner scanner1 = new Scanner(System.in);
		int input = scanner1.nextInt();
		
		System.out.println("Please input the width of your room (m)");
		Scanner scanner2 = new Scanner(System.in);
		double width = scanner2.nextDouble();
		System.out.println("Please input the depth of your room (m)");
		Scanner scanner3 = new Scanner(System.in);
		double depth = scanner3.nextDouble();
		
		double area = width * depth;
		
		switch (input){
		
			case (1):{
				System.out.println("The cheapest paint would be");
				System.out.println(FindCheapestPaint(area));
				break;
			}
		
			case (2):{
				System.out.println("The lease wasteful paint would be");
				System.out.println(FindLeastWastefulPaint(area));
				break;
			}
		}
		
		scanner1.close();
		scanner2.close();
		scanner3.close();
	}
	
	public static String FindCheapestPaint(double area){
		double cheapo = Math.ceil(area/200.0) * 19.99;
		double average = Math.ceil(area/165.0) * 17.99;
		double duluxourous = Math.ceil(area/200.0) * 25.0;
		
		if (cheapo < average && cheapo < duluxourous){
			return "CheapoMax";
		}
		else if (average < cheapo && average < duluxourous){
			return "AverageJoes";
		}
		else{
			return "DuluxourousPaints";
		}
	}
	
	public static String FindLeastWastefulPaint(double area){
		double cheapo = area%200.0;
		double average = area%165.0;
		double duluxourous = area%200.0;
		
		if (cheapo < average && cheapo < duluxourous){
			return "CheapoMax";
		}
		else if (average < cheapo && average < duluxourous){
			return "AverageJoes";
		}
		else{
			return "DuluxourousPaints";
		}
	}
	
}
