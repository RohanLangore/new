package Arrey;

import java.util.Scanner;

public class jagged {
	public static void main(String[] args) {

		int arr[][] = new int[3][];// jagged array
		int i, j;
		Scanner sc = new Scanner(System.in);

		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];

		for (i = 0; i < 1; i++) {
			for (j = 0; j < 1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (i = 1; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (i = 2; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (i = 0; i < 1; i++) {
			for (j = 0; j < 1; j++) {
				System.out.print("arr[" + i + "]" + "[" + j + "]" + arr[i][j]);
			}
			System.out.println();
		}

		for (i = 1; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.println("arr[" + i + "]" + "[" + j + "]" + arr[i][j] + "\t");
			}
			System.out.println();
		}

		for (i = 2; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("arr[" + i + "]" + "[" + j + "]" + "\t" + arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
