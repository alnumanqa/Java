package coddingChallenge;

public class Practice06 {
	
	public static void prymid(int n) {
		for (int i = 0; i < n; i++) {//0, 1, 2, 3
			for (int j = i; j < n -1; j++) {//0 1 2 3, 1 2 3, 2 3, 3
				System.out.print(" ");
			}
			
			for (int k = 0; k <= i ; k++) {//0, 0 1, 0 1 2, 0 1 2 3,
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		prymid(5);

	}

}
