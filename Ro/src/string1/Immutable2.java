package string1;

public class Immutable2 {
	public static void main(String[] args) {
		/*	String s="hello";
			System.out.println(s.hashCode());
			//s=s.concat("world");
			System.out.println(s.concat("world"));
			System.out.println(s.hashCode());
			System.out.println(s);*/
			
			
		/*	String s="hello";
			System.out.println(s.hashCode());
			s=s.concat("world");
			
			System.out.println(s.hashCode());
			System.out.println(s);*/
			
			String s="java";
			String s1=s+" programming";
			System.out.println(s);
			System.out.println(s1);
			
			String s3="java";
			System.out.println(s3.hashCode());
			s3=s3+"code";
			System.out.println(s3.hashCode());
			System.out.println(s3);
			System.out.println(s);

		}
}
