package excep;
//ARM
//finally block cleans up all the resources 
//used in try block
public class Finally {
	public static void main(String[] args) 
	{
		try
		{
		int a=10/3;
		System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero");
		}
		finally
		{
			System.out.println("file closed");
		}
		
		System.out.println("rest of the code");
		
	

	}
}
