package wrapper;
//When u want to convert ur string to respactive typpe
public class FloatWrapper {
	public static void main(String[] args) {
		Float f = new Float(23.4f);
		System.out.println(f + 10);

		Float f1 = new Float("3.4");
		String s = f1 + "10";
		System.out.println(s);

		String s1 = "1234"; // 1234
		Integer a = new Integer(s1);

		int in = Integer.parseInt(s1);
		System.out.println(in + 12);

		Character c = new Character('c');// hello
		char c1 = c;

	}
}
