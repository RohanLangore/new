package Arrey;

public class ForEachLoop {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 34, 5, 6 };

		// iterate
		// for each loop :It is used in collections
		// datatype variable:arrayname

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n backward");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n ---");

		for (int i : arr) {
			System.out.print(i+" ");
		}

	}
}
