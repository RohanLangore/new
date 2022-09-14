package Arrey;

public class Subtraction2D {

	public static void main(String[] args) {
		int a[][] = { 	{ 10, 20 ,8},
				  		{ 30, 40 ,7},
				  		{ 10, 60 ,6}, };

	int b[][] = {   { 10, 20 ,1}, 
					{ 30, 40 ,2}, 
					{ 50, 20 ,3}, };

	int c[][] = new int[3][3];

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			c[i][j] = a[i][j] - b[i][j];
		}
	}
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.print(c[i][j] + " ");
		}
		System.out.println(" ");
	}
	}

}
