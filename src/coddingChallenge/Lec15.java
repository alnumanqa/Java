package coddingChallenge;

/*
5! = 5x4x3x2x1
4! = 4x3x2x1
1! = 1
0! = 1 [Exception]

Explaining:
5! = 5x4x3x2x1
	 = 5x(5-1)x(5-2)x(5-3)x(5-4)

n! = nx(n-1)x(n-2)x(n-3)x(n-4)
	 = n(n-1)(n-2)(n-3)(n-4) ............(n-(n-1))

FYI: Why 0! = 1?
Factorial of a number in mathematics is the product of all the positive numbers less than or equal to a number.
But there are no positive values less than zero so the data set cannot be arranged which counts as the possible
combination of how data can be arranged (it cannot). Thus, 0! = 1.

*/

public class Lec15 {
	//1st way
	public static int factorial(int n) {
		if (n == 1) { // base case for recursion
			return 1;
		} else {
			return n * factorial(n -1);
		}
		
	}
	
	//2nd way
	public static int recfactorial(int m) {
		int total = m;
		for (int i = m -1; i >= 1; i--) {
			total = total * i;
		}
		return total;
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(recfactorial(6));
	}

}
