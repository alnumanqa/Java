package coddingChallenge;

import java.util.Scanner;

public class Palindrom01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scanner.nextInt();
		
		int original = num;
		 int reverse = 0;
		 
		 while(num != 0) {
			 reverse = reverse * 10 + num % 10;
			 num = num / 10;
		 }
		 
		 if (original == reverse) {
			 System.out.println(original + " palindrom");
		 }else {
			 System.out.println("not palindrom");
		 }
		 
		 scanner.close();

	}

}
