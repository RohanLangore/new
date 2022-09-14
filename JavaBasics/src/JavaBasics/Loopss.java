package JavaBasics;

import java.util.Scanner;

public class Loopss {

	public static void main(String[] args) {
		
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number ");
		int num=sc.nextInt();                 
		for(int i=num;i>=1;i--)
		{
			fact=i*fact;
			//System.out.println("factorial of given number is..."+fact);
		}
		System.out.println("factorial of given number is..."+fact);
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
