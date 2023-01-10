package coddingChallenge;

//Que: Print your name vertically but reverse
public class Lec2 {

	public static void main(String[] args) {
		String name = "Md Abdullah Al Numan";
		
		for (int i = name.length()-1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}
		

	}

}
