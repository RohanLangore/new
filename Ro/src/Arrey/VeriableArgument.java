package Arrey;

public class VeriableArgument {

	void accept(String... a) {

		for (String i : a) {
			System.out.print(i);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		VeriableArgument v = new VeriableArgument();
		v.accept("kinjal ", "c ", "c++");
		v.accept("ram ", "c ", "c++ ", "java ", "html");
		v.accept("ramesh ", "java ", "adv java");
		v.accept("sonal ");
		v.accept("priya ", "c");

	}
}
