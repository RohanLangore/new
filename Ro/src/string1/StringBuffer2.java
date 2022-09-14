package string1;

public class StringBuffer2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.hashCode());
		sb.append("java");

		System.out.println(sb);
		System.out.println(sb.hashCode());
	}
}