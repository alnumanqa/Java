package coddingChallenge;



// Que: How many 'a/A'  inside the provided String? They like to confuse you by not saying upper or lower
// you have to ask is it upper case or lower case?
// Better not to ask if they don't define

public class Lec7 {
	public static void main(String[] arg) {
		String name = "Md Abdullah  AAAA aaaaaaaa Al Numan";
		// String a = name.toLowerCase();
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			//if (a.charAt(i)== 'a') {
			if (name.charAt(i)== 'a' || name.charAt(i) == 'A') {
				count++;
			}
		}
		System.out.println(count);
	}

}
