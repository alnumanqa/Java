package coddingChallenge;

public class PraacticeLeftTringle {
	
	public static void lefttringle(int n) {
		for (int i = 0; i < n; i++) {
			//for (int j = i; j < n-1; j++) {
				//System.out.print("");
			//}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
}
	
	public static void main(String[] args) {
		lefttringle(5);
	}

}
