import java.util.Scanner;
public class CollagePlacement {
	int cse,ece,mech;
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of std placed in CSE - ");
		 cse= sc.nextInt();
		 System.out.print("Enter the Number of std placed in ECE - ");
		 ece= sc.nextInt();
		 System.out.print("Enter the Number of std placed in MECH - ");
		 mech= sc.nextInt();
}
	void calculate() {
		if(cse<0||ece<0||mech<0) {
			System.out.print(" Input is Invalid ");	
		}else if(cse==ece && ece==mech) {
			System.out.print(" None of The Department got the highest std places ");	
		}else if(cse==ece && mech<cse) {
			System.out.println("  highest placements ");	
			System.out.println(" CSE ");
			System.out.println(" ECE ");
		}else if(ece==mech && cse<mech) {
			System.out.println("  highest placements ");	
			System.out.println(" MECH ");
			System.out.println(" ECE ");
		}else if(cse==mech && ece<mech) {
			System.out.println("  highest placements ");	
			System.out.println(" MECH ");
			System.out.println(" CSE ");
		}else if(mech>cse && mech>ece) {
			System.out.println("  highest placements ");	
			System.out.println(" MECH ");
			}else if(cse>mech && cse>ece) {
				System.out.println("  highest placements ");	
				System.out.println(" CSE ");
				}else if(ece>mech && ece>cse) {
					System.out.println("  highest placements ");	
					System.out.println(" ECE ");
					}}
	public static void main(String[] args) {
		CollagePlacement cp=new CollagePlacement();
		cp.accept(); cp.calculate();
	}

}
