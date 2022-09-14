package JavaBasics;

import java.util.Scanner;

public class Both {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);

        System.out.println("Enter the prize and quntity::\n");

        float b = in.nextInt();
        float h = in.nextFloat();
        float a;
 
        a = (float)((b * h) );

        System.out.println("\nThe amount you have to pay is= " + a + " Rs\n");
		
		
		
		
	}

}
