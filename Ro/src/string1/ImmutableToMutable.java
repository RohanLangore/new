package string1;

public class ImmutableToMutable {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java");
		String s = sb.toString();
		System.out.println(s);
		System.out.println(s.hashCode());
		s = s.concat("programming");
		System.out.println(s.hashCode());

	}
}
