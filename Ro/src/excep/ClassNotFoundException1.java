package excep;
//import java.sql.SQLException;
public class ClassNotFoundException1 {
	public static void main(String[] args) throws ClassNotFoundException  {
		
		Class c;
		
			c = Class.forName("java.lang.String");
		 
		
		System.out.println("given class is present");
	

}
}
