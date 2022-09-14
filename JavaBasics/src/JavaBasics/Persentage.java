package JavaBasics;
import java.util.Scanner;
public class Persentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float m,p,c,per;
		System.out.println("enter the Marks of Math ");
		m=sc.nextFloat();
		System.out.println("enter the Marks of Chemistry ");
		c=sc.nextFloat();
		System.out.println("enter the Marks of physics ");
		p=sc.nextFloat();
		per=((m+p+c)*100)/300;
		System.out.println("Persentage of Marks "+per);
		if (per>=80)
			System.out.println("A+ Gread ");	
		else if (per>=60)
			System.out.println("A Gread ");
		else if (per>=50)
			System.out.println("B Gread ");
		else if (per>=40)
			System.out.println("C Gread ");
		else
			System.out.println("Student is fail ");
		sc.close();
	}

}
