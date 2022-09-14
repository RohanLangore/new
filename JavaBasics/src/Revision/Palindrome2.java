package Revision;

import java.util.Scanner;

public class Palindrome2 {
	int num;

	void check() {
		for (int i = 0; i < 6; i++) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number ");
			num = sc.nextInt();
			int reversedNum = 0, remainder;
			int originalNum = num;
			while (num > 0) {
				remainder = num % 10;
				reversedNum = reversedNum * 10 + remainder;
				num /= 10;
			}
			if (originalNum == reversedNum) {
				System.out.println(originalNum + " is Palindrome.");
			} else {
				System.out.println(originalNum + " is not Palindrome.");
			}
			if (num < 0)
				break;
		}
	}

	public static void main(String[] args) {
		Palindrome2 p = new Palindrome2();
		p.check();

	}

}
