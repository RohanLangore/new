package Arrey;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 5, 6, 4 };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element");
		int a = sc.nextInt();
		
		int found = 0;
		for (int i : arr) {
			if (i == a) {
				found = 1;
				break;
			}

		}

		if (found == 1) {
			System.out.println("Element is present in the Arrey");
		} else
			System.out.println("Element not present in the Arrey");

	}

}
