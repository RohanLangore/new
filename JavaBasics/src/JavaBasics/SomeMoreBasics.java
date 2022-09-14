package JavaBasics;

import java.util.Scanner;

public class SomeMoreBasics {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);

        System.out.println("Enter the base & height of the triangle::\n");

        float b = in.nextFloat();
        float h = in.nextFloat();
        float a;
 
        a = (float)((b * h) / 2);

        System.out.println("Area of the triangle = " + a + " sq. units");
		
		
		
		
		
	}	
}
