package coddingChallenge;
/*   Implement a large Pyramid of stars in the screen with java.
*
* *
* * *
* * * *
* * * * *
*/

public class Lec19 {
	
	public static void pyrmid(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n -1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("@ ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		pyrmid(6);
		

	}

}
