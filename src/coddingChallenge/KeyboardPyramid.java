package coddingChallenge;

import java.util.Scanner;

public class KeyboardPyramid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int pyramid = scanner.nextInt();
		
		for (int i = 0; i < pyramid; i++) {
			for (int j = i; j < pyramid -1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
