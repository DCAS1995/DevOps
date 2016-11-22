import java.util.ArrayList;

public class Task_7 {
	
	public static void main (String[] args){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 2; i<=3000000; i++){
			boolean isPrime = true;
			if( i%2 == 0 && i!=2){
				isPrime = false;
			}
			for (int j=0; j<primes.size()/2; j++){
				if(i%primes.get(j) == 0){
					isPrime = false;
					break;
				}
			}
				
				if(isPrime == true){
					primes.add(i);
				}
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("time: " + (double)(endTime-startTime)/1000 + " seconds");
		
		System.out.println(primes.size());	
		
	}
}
