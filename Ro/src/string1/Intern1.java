package string1;

public class Intern1 {
	public static void main(String[] args) {
		String s = "Ram";// 1000(scp)

		String s1 = new String("Ramesh");//12@d77(heap)
		
		//String s2=new String("Ramesh");
		//String s2="hello";//1000
		//float d=13445.768956f;
		//System.out.format("%.2f",d);
		
		String s3 = s1.intern();// 1000 String s3=s

		if (s == s3) {
			System.out.println("Username is valid");
		} else
			System.out.println("not equal");
		
		

	}
}
