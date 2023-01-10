package coddingChallenge;
//Que: How many 'a/A'  inside the provided String? They like to confuse you by not saying upper or lower
//you have to ask is it upper case or lower case?
//Better not to ask if they don't define

public class Lec8 {

	public static void main(String[] args) {
		String name = "Md Abdullah  AAAA aaaaaaaa Al Numan";
		name = name.toLowerCase();
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);

	}

}
