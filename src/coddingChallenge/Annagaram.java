package coddingChallenge;

import java.util.Arrays;

/*
Interview Question:
Write a Java Program to check if the two String are Anagram. 
Two String are called Anagram when there is same character but in different order.
For example,"CAT" and "ACT", "ARMY" and "MARY", "RACECAR" and  "RRAACCE", "MALAYALAM" and "MALAYALAM"
SO, A Palindrome word can be anagram too
*/
public class Annagaram {
	
	public static boolean isAnnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		char arr1 [] = str1.toCharArray();
		Arrays.sort(arr1);
		char arr2 [] = str2.toCharArray();
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}
	
	public static void main(String[] args) {
		System.out.println(isAnnagram("mary", "army"));
		System.out.println(isAnnagram("numan", "nazif"));
	}

}
