import java.util.Scanner;

public class SwitchAtm {

	public static void main(String[] args) {
		int balence=1000,wd,dp;
		Scanner sc=new Scanner(System.in);
		System.out.println(" MENU ");
		System.out.println(" 1.Withdraw ");
		System.out.println(" 2.Deposite ");
		System.out.println(" 3.Check Balence ");
		System.out.println(" 4.Exit ");
		System.out.println(" Enter your choice ");
		int choice=sc.nextInt();
		switch(choice) {
		 case 1: System.out.print("Enter Amount to Withdraw ");
		 		wd=sc.nextInt();
		 		if(balence>500)
		 		{
		 				
		 				System.out.print("insufficient balence  ");
		 		}
		 		else
		 		{
		 			balence=balence-wd;
	 				System.out.print("balence remain is  "+balence);
		 		}
	        break;
		 case 2: System.out.print("Enter Amount to Deposite ");
		 		dp=sc.nextInt();
		 		balence=balence+dp;
		 		System.out.print("your updeted balence is  "+balence);
		 		break;
		 case 3: System.out.print("your Acc balence is  "+balence );		
		 		break;
		 case 4: System.out.print("Thank you  " );		
	 		    break;		
		 default: System.out.print("invalid option  " );		
		        break;		
		}
			
	}

}
