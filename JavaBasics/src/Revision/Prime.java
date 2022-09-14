package Revision;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		int num,i,count=0;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		num=sc.nextInt(); 
		
		
		for(i=2;i<=num/2;i++) {
			
			if(num%i==0) { count=count+1; break; } }
		
		if(count==0) {System.out.println(num+" is a prime number ");}
		else         {System.out.println(num+" is not prime number "); }
		
		
			   
		}while(num>=0);
		
		
		
		
		
	}

}
