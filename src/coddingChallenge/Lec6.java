package coddingChallenge;
//Que: How many upper 'A'  inside the provided String?
//you have to ask is it upper case or lower case?
//Better not to ask if they don't define



public class Lec6 {

	public static void main(String[] args) {
		String name = "Md Abdullah  AAAA aaaaaaaa Al Numan";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'A') {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
