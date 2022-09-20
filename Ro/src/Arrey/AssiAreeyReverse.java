package Arrey;

import java.util.Scanner;

public class AssiAreeyReverse {
	public static void main(String[] a) {
		//	int arr[] = new int[5];
		//	System.out.println("Enter array elements");
			
			Scanner sc = new Scanner(System.in);
			int n;
			System.out.println("Enter array size");
			n=sc.nextInt();
			int []arr=new int[n];
			int i;
			
			System.out.println("enter array elements");
			for ( i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println("revers array elements");
			for ( i = n -1 ; i >= 0 ; i--)
			{
				System.out.println(arr[i]);	
			}
			
	}
}
