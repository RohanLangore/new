package excep;

public class PasswordException extends Exception {
	void accept() throws PasswordException {
		String s = "khadija";

		if (s.length() < 8) {
			throw new PasswordException();
		} else {
			System.out.println(s);
		}

	}

	void display() {

	}

	public static void main(String[] args) throws PasswordException {

		PasswordException p = new PasswordException();
		try {
			p.accept();
		} catch (PasswordException e) {
			System.out.println("8 charcters Required");
		}

		System.out.println("Restnof the code");
	}
}
