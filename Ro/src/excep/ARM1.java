package excep;

import java.io.FileInputStream;
import java.io.IOException;

public class ARM1 {
	public static void main(String[] args) throws IOException {
		int x = 0;

		try (FileInputStream fis = new FileInputStream("e:/data.txt")) {

			while ((x = fis.read()) != -1) {
				System.out.print((char) x);
				// throw new IOException();
			}
		}

	}
}
