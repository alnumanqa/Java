package coddingChallenge;

import java.util.Arrays;

/*
Fibonacci Series:
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, .............
= 0, 1, (1+0), {(1+0)+1}, [{(1+0)+1}+(1+0)], ..................
*/

// Can you write the logic for first 8 fibonacci series number?

public class Lec17 {
	
	public static int fibonacci(int n) {
		int arr [] = new int[n];
		for(int i = 0; i < n; i++) {
			if(i < 2) {
				arr[i] = i;
			}else {
				arr[i] = arr[i-1] + arr[i-2];
			}
		}
		System.out.println(Arrays.toString(arr));
		return n;
	}
	
	public static void main(String[] args) {
		fibonacci(13);
	}

}
