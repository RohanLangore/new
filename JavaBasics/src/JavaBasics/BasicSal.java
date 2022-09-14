package JavaBasics;
import java.util.Scanner;
public class BasicSal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		float basic,da,hra,gross;
		System.out.println("enter the Basic Salary ");
		basic=sc.nextFloat();
		da=(basic*35)/100;
		hra=(basic*25)/100;
		gross=basic+da+hra;
		
		if (gross>100000) {
			System.out.println("The person is vice president ");	
			}
		else if(gross>80000 && gross <= 100000) {
			System.out.println("The person is Asst. vice president ");	
		}
		else if(gross>60000 && gross <= 80000) {
			System.out.println("The person is Manager ");	
		}
		else if(gross>40000 && gross <= 60000) {
			System.out.println("The person is Asst. Manager ");	
		}
		else {
			System.out.println("The person is offiser ");	
		}

	}

}
