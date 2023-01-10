package coddingChallenge;
//Que: Print your name by reverse Horizontally
//output; namuN lA halludbA dM
public class Lec3 {

	public static void main(String[] args) {
		String name = "Md Abdullah Al Numan";
		
		for (int i = name.length()-1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}

	}

}
