
package assign;
import java.util.Scanner;
public class NumGussing {


		 void guessingNumber()
		    {
		     
		        Scanner r = new Scanner(System.in);
		 
		        int number = 51;
		        int K = 5;
		 
		        int i, guess;
		        System.out.println(
		            "A number is chosen"
		            + " between 1 to 100."
		            + "Guess the number"
		            + " within 5 trials.");
		 
		       
		        for (i = 0; i < K; i++) {
		 
		            System.out.println(
		                "Guess the number:");
		 
		            
		            guess = r.nextInt();
		 
		           
		            if (number == guess) {
		                System.out.println(
		                    "Congratulations!"
		                    + " You guessed the number.");
		                break;
		            }
		            else if (number > guess  && i != K - 1)
		                     {
		                System.out.println(
		                    "The number is "
		                    + "greater than " + guess);
		            }
		            else if (number < guess
		                     && i != K - 1) {
		                System.out.println(
		                    "The number is"
		                    + " less than " + guess);
		            }
		        }
		        
		 
		        if (i == K) {
		            System.out.println(
		                "You have completed"
		                + " K trials.");
		 
		            System.out.println(
		                "The number was " + number);
		        }
		    }
		 
		   
		    public static void main(String arg[])
		    {
		    	NumGussing n=new NumGussing();
		        
		        n.guessingNumber();
		    }
		

	

}
