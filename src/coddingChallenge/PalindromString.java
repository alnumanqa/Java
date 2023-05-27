package coddingChallenge;

public class PalindromString {

	public static void main(String[] args) {
		String orignal = "L";
		//orignal = orignal.toLowerCase();
		String reverse = "";
		for(int i = orignal.length() -1; i >=0; i--) {
			//System.out.print(orignal.charAt(i));
			reverse += orignal.charAt(i);
			//System.out.print(reverse);
			
		}
		boolean palindrom = true;
		for(int i = 0; i < orignal.length(); i++) {
			if(orignal.charAt(i) != reverse.charAt(i)) {
				palindrom = false;
			}
		}
		
		if(palindrom) {
			System.out.println(orignal +" palindrom" );
		}else {
			System.out.println(orignal +" Not palindrom");
		}

	}

}
