package excep;

public class NotValidAge extends Exception {
	int age = 20;

	void check() throws NotValidAge {
		if (age > 18) {
			System.out.println("valid");
		} else
			throw new NotValidAge();

	}

	public static void main(String[] args) {
		NotValidAge n = new NotValidAge();
		try {
			n.check();
		} catch (NotValidAge e) {
			System.out.println("age is not valid");
		}
	}

}
