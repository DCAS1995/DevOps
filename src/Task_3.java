import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Task_3 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		char[] array = string.toCharArray();
		List<Character> list = new LinkedList<>();
		for (char c: array ){
			list.add(c);
		}
		Collections.reverse(list);
		ListIterator<Character> li = list.listIterator();
		
		while(li.hasNext()){
			System.out.print(li.next());
		}
		
		scanner.close();
	}
}
