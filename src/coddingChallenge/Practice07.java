package coddingChallenge;

import java.util.Arrays;

public class Practice07 {

	public static void main(String[] args) {

		String str = "anfdjffnejhs";
		char arr[] = str.toCharArray();
		char temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println("Sorted string:" + Arrays.toString(arr));

	}

}
