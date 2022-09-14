package Arrey;

public class ArrayInMethod {
	void accept(int arr[]) {

		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			System.out.println(arr[i] + arr[j]);
		}
	}

	void max(int arr[]) {

	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 6, 7, 9, 11 };

		ArrayInMethod a = new ArrayInMethod();
		a.accept(arr);

	}

}
