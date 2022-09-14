package JavaBasics;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int Number;
				
		System.out.print("\n Please Enter any integer Value: ");
		Number = sc.nextInt();
		
		if (Number % 2 == 0) {
			System.out.println("\n You have entered EVEN Number");
		}
		else {
			System.out.println("\n You have entered ODD Number");
		}
		
		
		
	}

}
