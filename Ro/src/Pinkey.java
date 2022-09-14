import java.util.Scanner;

public class Pinkey {

	public static void main(String[] args) {
		int n,k,r,count=0;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the number");
		n=s.nextInt();
		System.out.print("Enter the key number");
		k=s.nextInt();
		int temp=n;
		
		while(temp>0)
		{
			   r=temp%10;
				if(r==k)
				{
				count++;
				}	
				temp/=10;

		}
		
		System.out.println(k+ " Appears "+count+" Times in a num "+n);	
	}

}
