import java.util.Scanner;
public class Coupon {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		String coupon;
		String movie_name;
		String th_name;
		float ticket_price, a,final_price=0;
		
		System.out.println("Enter theater name");
		th_name=s.next();
		
		System.out.println("Enter movie name");
		movie_name=s.next();
		
		System.out.println("Enter Ticket price");
		ticket_price=s.nextFloat();
		
		System.out.println("Enter Coupon");
		coupon=s.next();
		
		if(coupon.equals("gold")||coupon.equals("Gold")||coupon.equals("GOLD"))   // coupon.equals("gold")
		{
			a=(ticket_price*10)/100;
			final_price=ticket_price-a;
		}else if(coupon.equals("silver")||coupon.equals("Silver")||coupon.equals("SILVER")) 
		{
			a=(ticket_price*5)/100;
			final_price=ticket_price-a;
		}else if(coupon.equals("platinum")||coupon.equals("Platinum")||coupon.equals("PLATINUM")) 
		{
			a=(ticket_price*7)/100;
			final_price=ticket_price-a;
		}else if(coupon.equals("no")||coupon.equals("No")||coupon.equals("NO")) 
		{
			
			final_price=ticket_price;
		}else {
			System.out.println("");
		}
		System.out.println("Theter name is "+th_name);
		System.out.println("Movie name is "+movie_name);	
		System.out.println("Coupon is "+coupon);	
		System.out.println("Original price is "+ticket_price);	
		System.out.println("discounted price is "+final_price);	
		
		
		
	}

}
