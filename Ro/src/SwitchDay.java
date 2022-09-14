import java.util.Scanner;

public class SwitchDay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Which day of the week you want to know ");
		System.out.print("Enter a choice: ");
		int choice=sc.nextInt();
        switch(choice) {
        case 1: System.out.print("Sunday ");
        break;
        case 2: System.out.print("Monday ");
        break;
        case 3: System.out.print("Tuesday ");
        break;
        case 4: System.out.print("Wednesday ");
        break;
        case 5: System.out.print("Thursday ");
        break;
        case 6: System.out.print("Friday ");
        break;
        case 7: System.out.print("Saturday ");
        break;
        default: System.out.print("wrong input ");
       
        }
	}

}
