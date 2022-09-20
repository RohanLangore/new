package Revision;

public class CommndLine {
	public static void main(String[] args) {
		System.out.println(args.length);

		int a = Integer.parseInt(args[0]);
		String s = args[1];
		float f = Float.parseFloat(args[2]);

		System.out.println(a);
		System.out.println(s);
		System.out.println(f);
		System.out.println(args.length);

	}
}
