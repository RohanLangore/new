package excep;
//can u rethrow exception//yes
public class Ex11 {
	public static void main(String[] args) {
		InsufficientBalnce1 i=new InsufficientBalnce1();
		try
		{i.accept();}
		catch(Exception e)
		{
			System.out.println("Insuuficient balance");
			
		}
		
		
	}
}
