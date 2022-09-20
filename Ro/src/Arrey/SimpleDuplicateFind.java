package Arrey;

public class SimpleDuplicateFind {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 1, 3, 2, 1, 4, 2, 1 };
		int i, j;

		for (i = 0; i < arr.length; i++) {
			int count = 0;               // to start the count from 0 or you can start it by 1 also
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;             // 1 2 0 3 2 0 4 2 0 0 2 2
					arr[j] = 0;          // value here must be same as below if statment value either == or !=
				}
			}

			if (arr[i] != 0 && count > 1) {
				System.out.println(arr[i] + "--->" + count);
			}
		}

	}
}