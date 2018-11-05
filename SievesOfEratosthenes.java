
public class SievesOfEratosthenes {
	
	public static void main(String[] args) {
		
		singleThreadSieve();

	}
	
	private static void singleThreadSieve() {
		long startTime = System.nanoTime();
		int n = 1000000;
		
		//the prime number will be represented by the index
		//if it is true, the number represented by the index is not prime
		boolean arr[] = new boolean[n + 1]; // all initialized as false
		
		for(int i = 2; i*i <= n; i++) {
			if(arr[i] == false) {
				for(int j = i*2; j <= n; j += i)
					arr[j] = true;
			}
		}
		
		//print all prime numbers
		for(int i = 2; i <= n; i++) {
			if(arr[i] == false) {
				System.out.print(i + ", ");
			}
		}
		double totalTime = ( (double) System.nanoTime() - startTime) / 1000000000.0;
		System.out.println("\nSingle Thread Totaltime: " + totalTime + " seconds.\n");
	}
	
	private static void actorSieve() {
		
	}

}
