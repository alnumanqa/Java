package coddingChallenge;

import java.util.Arrays;

public class PracticeFibonacci {
	// 0 1 1 2 3 5 8 13
	public static void main(String[] args) {
		int a[] = new int[8];
		for (int i = 0; i < a.length; i++) {
			if (i <= 1) {
				a[i] = i; // 0 1 

			} else {
				a[i] = a[i - 1] + a[i - 2];// 1 3
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
