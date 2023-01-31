package coddingChallenge;



// Find prime number
public class Practice03 {
	
	public static boolean isPrimeNumber(int n) {
		if(n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
			
		
		return true;
	}
	
	public static void findPrimeNumber(int m) {
		for (int i = 0; i <= m; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(86));
		findPrimeNumber(13);
	}

}
