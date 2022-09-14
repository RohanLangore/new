package Arrey;

public class Ttanspose2D {
	public static void main(String[] args) {
		int a[][] = { 	{ 10, 20 ,55},
						{ 30, 40 ,66},
					 	{ 50, 60 ,44}, };
		
		int transpose[][]=new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				transpose[i][j] = a[j][i];
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}
