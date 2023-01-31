package coddingChallenge;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String s = "Md Abdllah Al Numan";
		s = s.toLowerCase();
		s = s.replaceAll("\\s", "");
		int count = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[j] == ch[i]) {
					System.out.println("duplicate character: " + ch[j]);
					count++;
					break;// duplicate wouldn't repate 
				}

			}
		}
		System.out.println(count);

	}

}
