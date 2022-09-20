package wrapper;

public class IntegerValueOF {
	public static void main(String[] args) {
		int a = 10;

		Integer a1 = Integer.valueOf(a);
		System.out.println(a1);

		Integer a2 = Integer.valueOf("222");
		System.out.println(a2);

		Integer a3 = Integer.valueOf("64", 2);
		System.out.println(a3);
	}

}
