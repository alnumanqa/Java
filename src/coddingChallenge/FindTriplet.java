package coddingChallenge;

//Input int arr [] = {1,4,45,6,10,8}; sum = 22;

public class FindTriplet {
	
	static int arr [] = {1,4,45,6,10,8};
	static int sum = 22;
	static int size = arr.length;
	
	public static int findThreeNumber(int[]arr, int size, int sum) {
		int count = 0;
		for(int i = 0; i < size - 2; i++) {
			for(int j = i + 1; j < size - 1; j++) {
				for(int k = j + 1; k < size; k++) {
					if(arr[i] + arr[j] + arr[k] == sum) {
						System.out.print("Triplets are:" + arr[i] + " " + arr[j] + " " + arr[k] + "\n");
						count++;
					}
					
				}
			}
		}
		System.out.println("Incident happen: " + count);
		return count;
	}
	

	public static void main(String[] args) {
		findThreeNumber(arr, size, sum);

	}

}
