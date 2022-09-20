package excep;

public class PasswordException1 extends RuntimeException {
	void accept() {
		String s = "khadija";

		if (s.length() < 8) {
			// throw new PasswordException1();
			System.out.println("required");
		} else {
			System.out.println(s);
		}

	}

	void display() {

	}

	public static void main(String[] args) {

		PasswordException1 p = new PasswordException1();
		try {
			p.accept();
		} catch (PasswordException1 p1) {
			System.out.println("8 charcters Required");
		}

		System.out.println("Restnof the code");
	}
}
