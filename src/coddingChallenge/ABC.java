package coddingChallenge;

import java.util.Scanner;

public class ABC {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		String ori = str;
		String rev = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		boolean palindrome = true;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != rev.charAt(i)) {
				palindrome = false;
			}
		}
		
		if(palindrome) {
			System.out.println(ori + " is palindrome");
		}else {
			System.out.println(ori +"not palindrime");
		}
		sc.close();
		
		
	}

}
