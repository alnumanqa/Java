package coddingChallenge;

public class ConvertSumOfTwoNumbersToAReverseString {

	public static void main(String[] args) {
		int a = 10;
		int b = 14;
		int add = a + b;
		
		String str = String.valueOf(add);
		String rev = "";
		for(int i = str.length() -1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		
		System.out.println(rev);

	}

}
