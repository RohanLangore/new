package JavaBasics;
import java.util.Scanner;
public class z6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

        System.out.println("Enter the Total Amount you want to withdraw  \n");

        float b = in.nextFloat();
        
        int a;
        a = (int)((b / 2000) );
        System.out.print("\n 2000- " + a + " notes");	
		
        int c;
        c = (int)((b % 2000)/500 );
        System.out.print("\n 500- " + c + " notes");
		
        int h;
        h = (int)(((b % 2000)%500)/200 );
        System.out.print("\n 200- " + h + " notes");
		
        int i;
        i = (int)((((b % 2000)%500)%200)/100 );
        System.out.print("\n 100- " + i + " notes");
		
        int j;
        j = (int)(((((b % 2000)%500)%200)%100) /50);
        System.out.print("\n 50-  " + j + " notes");
		
	}

}
