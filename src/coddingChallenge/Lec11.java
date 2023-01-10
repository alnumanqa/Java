package coddingChallenge;
// Find the largest number in an array
public class Lec11 {

	public static void main(String[] args) {
		int[] number = {12, 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 2, 44, 12, 456, 6, 4, 5, 5 };
		int largest = number[0];
		
		for (int i = 1; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
			}
		}
		System.out.println(largest);

	}

}
