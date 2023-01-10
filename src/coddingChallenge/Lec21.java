package coddingChallenge;

public class Lec21 {

	public static void main(String[] args) {
		int n = 10;
		int m = 15;

		n = n + m;
		m = n - m;
		n = n - m;
		System.out.println(n);
		System.out.println(m);

		int a = 5;
		int b = 7;
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);

	}

}
