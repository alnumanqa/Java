package coddingChallenge;

// Find factorial number of 7
public class Practice02 {

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);

		}

	}
	public static int recFactorial(int m) {
		int total = m;
		for (int i = m-1; i >= 1; i--) {
			total = total * i;
		}
		return total;
		
	}
	
	

	public static void main(String[] args) {
		System.out.println(factorial(8));
		System.out.println(recFactorial(5));

	}

}
