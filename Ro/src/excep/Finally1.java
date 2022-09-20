package excep;

public class Finally1 {
	public static void main(String[] args) {
		try {
			int div = 22 / 0;

			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println("Handled");
		}

		finally {
			System.out.println("Finally block");
		}

		System.out.println("rest of the code");

	}

}
