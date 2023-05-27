package coddingChallenge;

import java.util.Arrays;

public class Anno {
	public static boolean annogram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		str1.toLowerCase();
		str2.toLowerCase();
		char arr1 [] = str1.toCharArray();
		Arrays.sort(arr1);
		char arr2 [] = str2.toCharArray();
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
		
	}
	
	public static void main(String[] args) {
		System.out.println(annogram("Marry", "rramy"));
	}

}
