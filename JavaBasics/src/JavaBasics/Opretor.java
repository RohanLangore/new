package JavaBasics;
import java.util.Scanner;

public class Opretor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z=90,y=67;
		String msg = z<y ? z +" is minimum" : y + " is minimum" ;
		System.out.println( " "+msg );	
		 
		 
		 
		 System.out.println("Enter Three Integer");
	       int a = sc.nextInt();
	       int b = sc.nextInt();
	       int c = sc.nextInt();
		 int max= a>b ?(a>c ? a:c) : (b>c ? b:c);
		 System.out.println( " "+max );	
		 
		 
	}

}
