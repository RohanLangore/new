import java.util.Scanner;

public class FactorialSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number - ");
		 int n= sc.nextInt();
		 int p=1,s=0;
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j>0;j=j/10) {
				 int f=j%10;
				 p=p*f;
				 s=s+p;
				 }
		 }
		 System.out.print("s = "+s);
	}

}
