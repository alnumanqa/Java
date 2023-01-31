package coddingChallenge;


import java.util.HashSet;
import java.util.Set;

public class Practice04 {

	public static void main(String[] args) {
		int[] number = { 100, 77, 1, 5, 6, 1, 6, 8, 100, 55, 1, 7, 8, 5, 56, 100, 323, 2, 44, 12 };
		
		Set<Integer> duplicateNumber = new HashSet<>();
		for (int i =0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] == number[j]) {
					duplicateNumber.add(number[i]);
				}
			}
		}
		System.out.println("Duplicate number: " + duplicateNumber);
	}

}
