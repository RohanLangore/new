package string1;

public class Immutable {
	public static void main(String[] args) {
		/*	String s="hello";
			System.out.println(s.hashCode());
			//s=s.concat("world");
			System.out.println(s.concat("world"));
			System.out.println(s.hashCode());
			System.out.println(s);*/
			
			
			String s="hello";
			System.out.println(s.hashCode());
			s=s.concat("world");
			
			System.out.println(s.hashCode());
			System.out.println(s);

		}

}
