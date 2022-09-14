package JavaBasics;
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		int a, b, c, max;
        
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Three Integer");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
 
       
        if (a > b) {
           
            if (a > c)
                max = a;
            else
                max = c;
        } else {
           
            if (b > c)
                max = b;
            else
                max = c;
        }
        System.out.println("Largest Number : " + max);
		
		
		

	}

}
