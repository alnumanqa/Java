package coddingChallenge;

import java.util.Arrays;

public class FindTheSecondLargestNumberInTheArray {
	public static void main(String[] args) {

		int number [] = {2,10,9,8,100};//2,9,10
		int temp;
		
		for(int i = 0; i < number.length;i++) {
			for (int j = i+1; j<number.length;j++) {
				if(number[i] > number[j]) {
					temp = number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(number));
		System.out.println(number[number.length-1]);
		System.out.println(number[number.length-2]);
	}

}
