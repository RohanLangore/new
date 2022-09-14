package JavaBasics;
import java.util.Scanner;
public class z4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

        System.out.println("Enter the principle Amount - \n");
        float b = in.nextFloat();
        System.out.println("Enter the Rate of Interest - \n");
        float h = in.nextFloat();
        System.out.println("Enter the Time Period - \n");
        float k = in.nextFloat();
        
        
        float a;
        a = ((b * h * k)/ 100 );
        System.out.println("\nThe Simple Interest  is =  " + a + " ");	
		
       
		
       
		
		
		
		
		
		
		
		
		

	}

}
