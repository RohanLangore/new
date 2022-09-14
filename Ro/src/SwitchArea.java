import java.util.Scanner;

public class SwitchArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" MENU ");
		System.out.println(" 1.Area of a Circle ");
		System.out.println(" 2.Area of a Square ");
		System.out.println(" 3.Area of a right angled triangle ");
		System.out.println(" 4.Area of a Rectangle ");
		System.out.println(" 5.Circumference of a Circle ");
		System.out.println(" 6.perimeter of a Squaer ");
		
		System.out.print("Enter a choice: ");
        int choice=sc.nextInt();
        switch(choice) {
        case 1: System.out.print("Enter a Radius: ");
                float r=sc.nextFloat();
                float ac = (float)3.14*r*r;
                System.out.print("Area is "+ac);
                break;
        case 2: System.out.print("Enter the sides of square: ");
        	float x=sc.nextFloat();
        	float as = x*x;
        	System.out.print("Area is "+as);
        	break;
        
        case 3: System.out.print("Enter the base and the height: ");
        	float h=sc.nextFloat();
        	float ba=sc.nextFloat();
        	float art = (float)0.5*h*ba;
        	System.out.print("Area is "+art);
        	break;
        
        case 4: System.out.print("Enter the length and breadth: ");
        	float l=sc.nextFloat();
        	float b=sc.nextFloat();
        	float ar = (float)l*b;
        	System.out.print("Area is "+ar);
        	break;
        
        case 5: System.out.print("Enter a Radius: ");
        	float re=sc.nextFloat();
        	float c = (float)3.14*2*re;
        	System.out.print("Circumference is is "+c);
        	break;
        
        case 6: System.out.print("Enter a side: ");
        	float s=sc.nextFloat();
        	float ps = (float)4*s;
        	System.out.print("Perimeter is is "+ps);
        	break;
        }
        
	}

}
