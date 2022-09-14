package assign;
import java.util.Scanner;

public class MobileMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter mobile brand name");
		String bname = sc.next();
		System.out.println("Enter mobile price");
		int price = sc.nextInt();
		System.out.println("Enter power output of charger");
		String charger = sc.next();
		System.out.println("Enter Screenprotector size");
		String ScreenP = sc.next();
		System.out.println("Enter screentype Amoled / IPS LCD");
		String screenType = sc.next();
		System.out.println("Enter Mobile Colour");
		String colour = sc.next();

		Mobile c = new Mobile();
		c.setScreenType(screenType);
		c.setPrice(price);
		c.setColour(colour);

		MAccesaries i = new MAccesaries();
		c.setI(i);

		c.getI().setBname(bname);
		c.getI().setCharger(charger);
		c.getI().setScreenP(ScreenP);

		System.out.println(c.getScreenType());
		System.out.println(c.getColour());
		System.out.println(c.getPrice());

		System.out.println(c.getI().getBname());
		System.out.println(c.getI().getCharger());
		System.out.println(c.getI().getScreenP());
	}

}
