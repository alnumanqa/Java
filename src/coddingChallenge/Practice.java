package coddingChallenge;

import java.util.Arrays;

// Find first 10 fibonacci number
//fibonacci number is sum of two preceding number

public class Practice {

	public static void main(String[] args) {
		int arr [] = new int [10];
		for (int i = 0; i < 10; i++) {
			if (i <= 1) {
				arr[i] = i;
			} else {
				arr[i] = arr[i-1] + arr[i-2];
			}
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
