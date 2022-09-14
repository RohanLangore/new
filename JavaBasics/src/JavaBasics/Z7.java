package JavaBasics;
import java.util.Scanner;
public class Z7 {

	public static void main(String[] args) {
		
		 int num, den;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter Numerator: ");
	      num = s.nextInt();
	      System.out.print("Enter Denominator: ");
	      den = s.nextInt();
	      
	      if(num%den==0)
	         System.out.println("\n" +num+" is divisible by " +den);
	      else
	         System.out.println("\n" +num+" is not divisible by " +den);
		
		
		
		
		
		
		

	}

}
