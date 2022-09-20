package Revision;
import java.util.Scanner;
public class NumberSeries1 {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		int n,i,pr=0;
	System.out.println("Enter how many numbers you want to print");
		n=r.nextInt();
		
		for(i=1;i<=n;i++) {
			pr=(pr*2)+1;
			System.out.println(pr+" ");
		}
		r.close();
	}

}
