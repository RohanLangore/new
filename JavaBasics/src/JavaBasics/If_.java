package JavaBasics;
import java.util.Scanner;
public class If_ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int qt,amt,pr;
		float discount,totalbill;
		
		System.out.print("enter the Quantity ");
		qt=sc.nextInt();
		System.out.print("enter the prize of each quentity ");
		pr=sc.nextInt();
		amt=qt*pr;
		System.out.println("total amount is "+amt);
		
		
		if(amt>5000) {
		
			System.out.print("congratuletion you got 5% discount\n");
			discount=(amt*5)/100;
			System.out.print("dicsount is = "+discount);
			totalbill=amt-discount;
			System.out.println(" you get to pay -"+totalbill);
		}
			
		else
			System.out.print("you only have to pay -"+amt);
		
		
		
		
		
	}

}
