import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		int rem=0,sum=0,product=1;
		while (num!=0) {
		rem=num%10;
		num=num/10;
		product=product*rem;
		System.out.println("digits of given number "+rem);
			
		}
		System.out.print("product is "+product);
	}

}
