import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);  
		System.out.print("Enter a number to check: ");  
		
		int n = in.nextInt();  
		int count=0;  
		
		int square = n*n;  
		
		int temp = n;    
		
		while(temp>0)  
		{  
		count++;  
	
		temp=temp/10;  
		}   
		
		int lastDigit = (int) (square%(Math.pow(10, count)));   
		
		if(n == lastDigit)  
		System.out.println(n+ " is an automorphic number.");  
		else  
		System.out.println(n+ " is not an automorphic number.");  
	}

}
