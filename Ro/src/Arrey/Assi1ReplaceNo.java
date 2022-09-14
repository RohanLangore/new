package Arrey;
public class Assi1ReplaceNo {
	public static void main(String[] args) {
		int arr[] = { 72, 69, 76, 76, 79 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 10 == 9) {
				arr[i] = 0;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
