package Arrey;

import java.util.Scanner;

public class Assi1PairOfElements {
	public static void main(String[] args) {

		int arr[] = { 4, 6, 5, -10, 8, 5, 20 };
		int i, j;

		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int numsum;
		numsum = sc.nextInt();

		for (i = 0; i < arr.length; i++) {
			int count = 0;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == numsum) {

					System.out.println(arr[i] + "+" + arr[j] + "=" + numsum);
				}
			}

		}
	}
}
