package coddingChallenge;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueCharMap {

	public static void main(String[] args) {
		String a = "aabcdbe";
		// char arr [] = a.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}

		for (Entry<Character, Integer> entrySet : map.entrySet()) {
			if (entrySet.getValue() == 1) {
				System.out.println(entrySet.getKey());
				break;
			}
		}

	}

}
