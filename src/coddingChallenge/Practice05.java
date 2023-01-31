package coddingChallenge;
//Reversing a number
public class Practice05 {
	
	
	
	public static void main(String[] args) {
		
		
		int num = 1234;
		
		int rev = 0;
		
		while(num != 0){
			rev = rev*10 + num%10; // (0 * 10 = 0 + 1234 % 10 = 4) = 4, (4*10=40+123%10=3)=43, (43*10=430+ 12%10=2)=432,
			//(432*10=4320 + 1%10=1)=4321
			num = num / 10; // 1234 / 10 = 123, 123/10 = 12, 12/10 =1, 1/10=0
		}
		System.out.println("reverse num: " + rev);
	}

}
