package Arrey;

public class ForEachLoop {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 34, 5, 6 };

		// iterate
		// for each loop :It is used in collections
		// datatype variable:arrayname

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("backward");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		
		System.out.println("---");

		for (int i : arr) {
			System.out.println(i);
		}

	}
}
