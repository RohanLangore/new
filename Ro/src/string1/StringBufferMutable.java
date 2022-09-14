package string1;

public class StringBufferMutable {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();

		System.out.println(s1.length());
		s1.append("hello");
		System.out.println(s1.hashCode());
		
		/*System.out.println(s1.capacity());
		System.out.println(s.hashCode());
		s.append("world");
		System.out.println(s.hashCode());
		System.out.println(s);*/
		
		//s.reverse();
	/*	System.out.println8(s);*/
		//s.deleteCharAt(3);
	/*	System.out.println(s);
		s.delete(1, 3);*/
	System.out.println(s1);

	s1.append("aaaaa", 2, 5);
	System.out.println(s1);

	s1.insert(2, "bbbb");

	System.out.println(s1);
	System.out.println(s1.hashCode());

}

}
