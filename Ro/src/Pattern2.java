import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        //Taking rows value from the user

        System.out.println("How many rows you want in this pattern?");

        int rows = sc.nextInt();

        System.out.println("Here is your pattern....!!!");

        int alphabet = 65; // ASCII value of alphabet 'A'

        for (int i= 1; i<= rows ; i++)
        {
            int count = rows -1;
            int tempVariable = i;
            for (int j=1; j<=i; j++)
            {
                System.out.printf("%4c", (char)tempVariable+alphabet-1);
                tempVariable = tempVariable + count;
                
                count--;
            }
            System.out.println("");

	}

	}

}
