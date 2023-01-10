package coddingChallenge;

//Que: How many vowel is in the String?
public class Lec9 {
	public static void main(String[] arg) {
		String name = "Md Abdullah  AAAA aaaaaaaa Al dfhetflcvbouuxlvhxzaariou Numan";
		name = name.toLowerCase();
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
