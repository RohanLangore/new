package Arrey;

public class Spars2D {

	public static void main(String[] args) {
		int arr[][] = { { 0, 5, 0 },
						{ 0, 0, 6 },
						{ 7, 0, 6 } };
		int row, col, counter = 0;

		for (row = 0; row < 3; row++)
			for (col = 0; col < 3; col++) {
				if (arr[row][col] == 0)
					counter++;
			}

		if (counter > 9 / 2)
			System.out.println("It is a sparse matrix");
		else
			System.out.println("It is not a sparse matrix");
	}
}
