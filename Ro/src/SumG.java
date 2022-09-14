import java.util.Scanner;

public class SumG {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter a Number: ");
		 
		int num=s.nextInt();
		int sum=0;
		while(num>0) {
			int d=num%10;
			sum+=d;
			num/=10;
		}
		
		System.out.print(" sum is: "+sum);
		
		
	}

}
