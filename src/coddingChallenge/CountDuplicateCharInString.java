package coddingChallenge;

import java.util.HashSet;
import java.util.Set;

public class CountDuplicateCharInString {

	public static void main(String[] args) {
		String s = "Md Abdllah Al Numan";
		s = s.toLowerCase();
		s = s.replaceAll("\\s", "");
		int count = 0;
		
		char ch[] = s.toCharArray();
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[j] == ch[i]) {
					//System.out.println("duplicate character: " + ch[i]);
					set.add(ch[i]);
					count++;
					break;
					
				}

			}
		}
		System.out.println(count);
		System.out.println(set);

	}

}
