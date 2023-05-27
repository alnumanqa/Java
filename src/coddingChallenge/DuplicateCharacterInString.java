package coddingChallenge;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		String str = "a beautiful beach bob";
		str = str.replaceAll("\\s", "");
		
		char arr [] = str.toCharArray();
		int count = 0;
		Set<Character> set = new HashSet<>();
		for(int i = 0; i <arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					set.add(arr[i]);
				}
			}
		}
		System.out.println(set);
		System.out.println(count);
		

	}

}
