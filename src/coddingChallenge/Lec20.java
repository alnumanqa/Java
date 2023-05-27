package coddingChallenge;

import java.util.Date;

public class Lec20 {

	public static void main(String[] args) {
		// ^a-zA-Z0-9 = called regular expression or regex
		// ^ is called carat or xor, ~ is called tilde, ` is called grave accent, back
		// tick, back quote
		// * is called asterisk, & is called and (or) ampersand, # is called (pound,
		// hash, number)
		// ' is called (apostrophe, prime, single quote)
		// https://finallylearn.com/what-are-the-keyboard-symbol-names/
		String s = "Hello%&^&(1234)";
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
		Date date = new Date();
		date.after(date);
		date.before(date);
		System.out.println(date);

	}

}
