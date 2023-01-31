package coddingChallenge;

public class StaticBlockPractice {
	static int n = 9;

	static {
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
	}

}
