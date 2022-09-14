package excep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader1 {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		System.out.println("Enter name");
		String name = br.readLine();

		System.out.println("Enetr id");
		int id = Integer.parseInt(br.readLine());

		System.out.println("Enter salary");
		float sal = Float.parseFloat(br.readLine());

		System.out.println("Enter gender");
		char ch = (char) br.read();

		System.out.println("name is.." + name);
		System.out.println("id is..." + id);
		System.out.println("salary is..." + sal);
		System.out.println("gender is.." + ch);

	}
}
