package coddingChallenge;

public class Practice08 {

	public static void main(String[] args) {
		String str = "anfdjffnejhs";
		char arr [] = str.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] == arr[i]) {
					System.out.println("Duplicate Character: " + arr[i]);
					count++;
					break;
					
				}
			}
		}
		System.out.println(count);

	}

}
