import java.util.Scanner;

public class Task_9 {
	
	public static String lcs(String a, String b){
	    if(a.length() == 0 || b.length() == 0){
	        return "";
	    }else if(a.charAt(a.length()-1) == b.charAt(b.length()-1)){
	        return lcs(a.substring(0,a.length()-1),b.substring(0,b.length()-1))
	            + a.charAt(a.length()-1);
	    }else{
	        String x = lcs(a, b.substring(0,b.length()-1));
	        String y = lcs(a.substring(0,a.length()-1), b);
	        return (x.length() > y.length()) ? x : y;
	    }
	}
	
	public static void main(String[] args){
		Scanner scanner1 = new Scanner(System.in);
		String string1 = scanner1.next();
		Scanner scanner2 = new Scanner(System.in);
		String string2 = scanner2.next();
		
		System.out.println("LCS of " + string1 + " and " + string2 + " is " + lcs(string1,string2));
		
		scanner1.close();
		scanner2.close();
	}
}
