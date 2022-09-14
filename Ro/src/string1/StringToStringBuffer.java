package string1;

public class StringToStringBuffer {
	public static void main(String[] args) {
		String s = "hello";

		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.hashCode());
		System.out.println(sb);
		sb.append("world");
		System.out.println(sb);
		System.out.println(sb.hashCode());

	}
}
