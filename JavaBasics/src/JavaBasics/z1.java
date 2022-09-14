package JavaBasics;
import java.util.Scanner;
public class z1 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);

        System.out.println("Enter the redius of a Circle \n");

        float b = in.nextFloat();
        
        float a;
        a = (float)((b * 2 * Math.PI) );
        System.out.println("\nThe Perimeter of a circle is =  " + a + " units");	
		
        float c;
        c = (float)((b * b * Math.PI) );
        System.out.println("\nThe Area of a circle is =  " + c + " sq units");
		
		
		
		
		
		
		
	}

}
