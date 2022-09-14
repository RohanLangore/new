package Arrey;

public class Minimum2D {
//here j=column and we are going monimum coloum wise
	public static void main(String[] args) {
		int arr[][] = { { 22, 20, 19 },
				        { 21, 26, 18 },
				        { 12, 25, 16 } };

		for (int i = 0; i < 3; i++) {
			int min = arr[0][i];

			for (int j = 1; j < 3; j++) {

				if (arr[j][i] < min) {
					min = arr[j][i];
				}
			}
			System.out.println(min);
		}

		
	}

}
