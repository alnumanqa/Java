package coddingChallenge;
/*
Prime number is a positive natural number that has only two positive natural number divisors - 1 and the number itself.
Prime numbers are subset of natural numbers. A natural number is a positive natural number that has at least one positive divisor other than one or itself.
The number 1 is not a prime number by definition - it has only one divisor.
The number 0 is not a prime number - it is not a positive number and has infinite number of divisors.
Prime numbers list
List of prime numbers up to 100: 
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, ...
Is 0 a prime number?
The number 0 is not a prime number.
Zero is not a positive number and has infinite number of divisors.
Is 1 a prime number?
The number 1 is not a prime number by definition.
One is has one divisor - itself.
Is 2 a prime number?
The number 2 is a prime number.
Two has 2 natural number divisors: 1 and 2
2 / 1 = 2
2 / 2 = 1
6/2 = 3
6/3 = 2
6/1 = 6
6/6 = 1
so, 6 is not a prime number
I introduce what is divisor, what is remainder and what is divider
7/3 ---> divisor is 3, remainder is 1, quotient is 2
 * */

// Can you tell how many prime number present within 30?

public class Lec18 {
	public static boolean isPrimeNumaber(int n) {
		if(n <= 1) { // 0, 1 will be excluded from here
			return false;
		}
		for(int i = 2; i < n; i++) { // start evaluation from 2, as 2<2 condition is not correct, so it will be outside loop and accept line 61
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void findPrimeNumber(int m) {
		for(int i = 0; i <= m; i++) {
			if(isPrimeNumaber(i)) {
				System.out.print(i + " ");
			}
		}
	} 
	
	public static void main(String[] args) {
		System.out.println(isPrimeNumaber(7));
		findPrimeNumber(13);
	}
		

}
