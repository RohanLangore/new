package JavaBasics;
import java.util.Scanner;


public class Opretor2 {

	public static void main(String[] args) {
		
		Scanner N = new Scanner(System.in);
		int a, b, c, sec;
		System.out.print("Enter three numbers.\n>  ");
		a = N.nextInt();
		b = N.nextInt();
		c = N.nextInt();
		sec=(a>b)? (b>c)? b : c : (a>c)? a : c;
		System.out.print(sec);	
		
		
		
		
		
	}

}
