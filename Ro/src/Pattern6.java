
public class Pattern6 {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
				
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
				
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
				
			}
			System.out.println(" ");
		}

	}

}
