package coddingChallenge;

import java.util.Scanner;

public class RightTringle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			for (int j = i; j < number -1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
