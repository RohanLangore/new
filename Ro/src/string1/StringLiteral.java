package string1;
public class StringLiteral {
	public static void main(String[] args) 
	{
		String s="hello";//String literal
		String s1="hello";
		String s3=new String("Hello");
	
		//System.out.println(s3);
	/*	in this case this could come equal also
	 * if(s==s1)
		{
			System.out.println("equal");
		}
		else System.out.println("not equal");*/
		
		if(s.equalsIgnoreCase(s3))
		{
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
		
}
}
