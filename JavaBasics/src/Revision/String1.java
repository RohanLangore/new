package Revision;

public class String1 {
	public static void main(String args) {

		// immutable to mutable
		String s = "java programming";// immutable
		StringBuffer sb = new StringBuffer(s);// mutable

		sb.append(" language");
		System.out.println(sb);

		// mutable to immutable
		String s2 = sb.toString();
		StringBuilder sb1 = new StringBuilder();

	}
}
