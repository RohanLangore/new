package JavaBasics;
import java.util.Scanner;
public class if_else {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks\n");
		
		int marks=sc.nextInt();
		if(marks>=40)
		
			System.out.println("congratuletion you are passed\n");
		else
			System.out.println("sorry you are fail\n");
		
		
	}

}
