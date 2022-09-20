package Arrey;

public class RRDesending {
	
	public static void main(String[] args) {
//you can also write--> int[] arr = new int[] { 2, 4, 6, 7, 18, 12 };
		
	int[] arr = { 2, 4, 6, 7, 18, 12 };
	int temp = 0;
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[i] < arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println();
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	
}}
