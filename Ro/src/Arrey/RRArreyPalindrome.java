package Arrey;

public class RRArreyPalindrome {
	public static void main(String[] args) {
		int arr[] = {  2, 3, 15, 15, 3, 2 };
		int n = arr.length;
		int count = 0;
		for (int i = 0; i <= n / 2 && n != 0; i++) {

			
			if (arr[i] != arr[n - i - 1]) {
				count = 1;
				break;
			}
		}

		
		if (count == 1)
			System.out.println("Not Palindrome");  //All Element not Are Same
		else
			System.out.println("Palindrome");      //All Element Are Same
	
	}
}
