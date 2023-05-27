package coddingChallenge;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
		if((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0)) {
			System.out.println(year + " is leapYear");
		}else {
			System.out.println(year + " is not leapyear");
		}
		sc.close();

	}

}
