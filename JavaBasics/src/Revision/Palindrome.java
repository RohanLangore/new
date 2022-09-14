package Revision;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int r, n, sum = 0, temp;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		n = sc.nextInt();

		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = ((sum * 10) + r);
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println(" is a Palindrome number ");
		} else {
			System.out.println(" is not Palindrome number ");
		}

	}

}
