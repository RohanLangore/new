package Arrey;

import java.util.Scanner;

public class AssiDuplicate {
	public static Scanner sc;
	public static void main(String[] args) {
		int no, i, j, temp = 0;
		sc = new Scanner(System.in);
		System.out.print("Please Enter the size of the array : ");
		no = sc.nextInt();
		int[] temp_arr = new int[no];
		
		
		System.out.format("Enter The elements of Array total %d elements : ", no);
		for (i = 0; i < no; i++) {
			temp_arr[i] = sc.nextInt();
		}

		
		for (i = 0; i < no; i++)                {
			for (j = i + 1; j < no; j++)        {
				if (temp_arr[i] == temp_arr[j]) {
					temp++;
					
					System.out.println("The duplicates number is = "+temp_arr[i]);
					break;
				}
			    }
		        }

		System.out.println("Total Number of Duplicate elements in the array  = " + temp);
		
	}
}
