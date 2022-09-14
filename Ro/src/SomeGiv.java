import java.util.Scanner;

public class SomeGiv {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int i,sum=0,a;
		a = s.nextInt();
		while(a!=0) {
			sum=sum+a;
			a=s.nextInt();
		}
		System.out.print(" sum is: "+sum);
		
	}

}
