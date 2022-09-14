import java.util.Scanner;
public class MaxNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		int rem,max=0;
		
		while(num>0) {
			rem=num%10;
			num/=10;
			if(rem>max) {
				max=rem;
			}
			
			
		}
		System.out.print(" "+max);
			
	}

}
