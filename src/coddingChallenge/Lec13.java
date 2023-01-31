package coddingChallenge;

import java.util.HashSet;

import java.util.Set;

//Find a string which present more than one
public class Lec13 {

	public static void main(String[] args) {
		String[] name = { "Java", "C++", "C#", "Python", "Java", "C++", "Java", "Python", "Javascript", "C++" };

		Set<String> a = new HashSet<>();
		// List<String> a = new ArrayList<>(); will return duplicate

		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].equals(name[j])) {
					a.add(name[i]);

				}

			}
		}
		System.out.println(a);

	}

}
