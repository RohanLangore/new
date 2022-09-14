import java.util.Scanner;

public class ProductG {

	public static void main(String[] args) {
	
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter a Number: ");
		 
		int num=s.nextInt();
		int sum=1;
		while(num>0)
		{
			
			int d=num%10;
			
			num/=10;
			sum*=d;
		}
		
		System.out.print(" sum is: "+sum);
	}

}
