package JavaBasics;
import java.util.Scanner;
public class z5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

        System.out.println("Enter the Total Number of days  \n");

        float b = in.nextFloat();
        
        float a;
        a = ((b / 365) );
        System.out.println("\n   " + a + " years");	
		
        float c;
        c = ((b % 365)/30 );
        System.out.println("\n  " + c + " months");
		
        float h;
        h = ((b % 365)%30 );
        System.out.println("\n " + h + " days");
		
		
		
		

	}

}
