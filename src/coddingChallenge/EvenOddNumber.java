package coddingChallenge;

public class EvenOddNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 6 };
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				System.out.println("Even Number: " +a[i]);
			} 
			else if(a[i] % 2 == 1) {
				System.out.println("Odd Number: " + a[i]);
			}
		}

	}

}
