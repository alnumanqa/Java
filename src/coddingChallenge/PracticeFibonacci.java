package coddingChallenge;

import java.util.Arrays;

public class PracticeFibonacci {

	public static void main(String[] args) {
		int a[] = new int[8];
		for (int i = 0; i < 8; i++) {
			if (i <= 1) {
				a[i] = i;

			} else {
				a[i] = a[i - 1] + a[i - 2];
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
