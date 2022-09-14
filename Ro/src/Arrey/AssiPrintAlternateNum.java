package Arrey;

public class AssiPrintAlternateNum {
	static void printAlter(int[] arry, int N) {

		for (int i = 0; i < N; i++) {

			if (i % 2 == 0) {
				System.out.print(arry[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arry = { 1, 2, 3, 4, 5, 6 };
		int N = arry.length;

		printAlter(arry, N);
	}
}
