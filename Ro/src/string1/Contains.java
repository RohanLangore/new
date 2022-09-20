package string1;

public class Contains {
	public static void main(String[] args) {
		String s="hello";
		/*boolean b=s.contains("l");
		if(b==true)
		{
			System.out.println("Given string is present");
		}
		else
			System.out.println("given String not present");*/
		
		System.out.println(s.endsWith("lo"));              //boolean vlaue
		System.out.println(s.startsWith("he"));            //boolean vlaue
		System.out.println(s.startsWith("llo", 2));        //boolean vlaue
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
	}
}
