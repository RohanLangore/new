package excep;

import java.io.IOException;

public class Rethrow {

	static void check(int age) throws IOException {
		try {
			if (age > 18)
				System.out.println("Eligible to vote");
			else
				throw new IOException();
		} catch (IOException e) {
			System.out.println("cannot vote");
			throw new IOException();
		}
	}

	public static void main(String a[]) throws IOException {
		try {
			check(16);
		} catch (IOException e) {
			System.out.println("handled gain");
		}

		System.out.println("rest of the code");
	}
}
