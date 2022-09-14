import java.util.Scanner;

public class BillPuff {

	public static void main(String[] args) {
		int p,pu,cd,a;
		System.out.println("Bill Details");
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the number of pizza bought ");
		p=s.nextInt();
		System.out.print("Enter the number of puffs bought ");
		pu=s.nextInt();
		System.out.print("Enter the number of Cold Drinks bought ");
		cd=s.nextInt();
		a=(p*100)+(pu*20)+(cd*10);
		System.out.print("Total Price = "+a);
	}

}
