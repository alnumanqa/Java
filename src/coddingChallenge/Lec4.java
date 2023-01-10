package coddingChallenge;


/*
 * Input: "Hello Mohammad Tofael Kabir Sharkar"
Output: "Sharkar Kabir Tofael Mohammad Hello"
 */
public class Lec4 {

	public static void main(String[] args) {
		String name = "Md Abdullah Al Numan";
		String a [] = name.split(" ");
		//System.out.println(Arrays.toString(a));
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}

}
