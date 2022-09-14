package Revision;

import java.util.Scanner;

public class NumberSeries2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,num,pr=2;
		System.out.println("Enter how many numbers you want to print");
		n=sc.nextInt();
		
		for(int i=2;i<=n;i++) {
			pr=((pr*2)-1);
			
			System.out.println(pr+" ");
		}
		sc.close();

	}

}
