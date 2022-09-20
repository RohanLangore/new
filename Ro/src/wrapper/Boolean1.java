package wrapper;

public class Boolean1 {
	public static void main(String[] args) {
		Boolean b = new Boolean(true);
		System.out.println(b);

		Boolean b2 = new Boolean("false");
		System.out.println(b2);

		Boolean b3 = new Boolean("äbc");
		System.out.println(b3);

		byte by1 = 23;
		Byte by2 = Byte.valueOf(by1);
		System.out.println(by2);

	}
}
