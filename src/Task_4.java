import java.util.Scanner;

public class Task_4 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		StringBuilder string1 = new StringBuilder();
		string1.append(string);
		string1=string1.reverse();
		
		for(int i=0; i<string1.length(); i++){
			System.out.print(string1.charAt(i));
		}
		
		scanner.close();
	}
}
