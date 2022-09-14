package JavaBasics;
import java.util.Scanner;
public class Z8 {

	public static void main(String[] args) {
		
		 int num;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      num = s.nextInt();
	      
	      if(num%3==0 && num%8==0)
	         System.out.println("\nIt is divisible by 3 and 8.");
	      else
	         System.out.println("\nIt is not divisible by 3 and 8.");
		
		
		
		
		

	}

}
