package string1;

import java.util.Arrays;

public class Method3 {

	public static void main(String[] args) {
		String s = "java programming language";
		System.out.println(s.substring(5));
		System.out.println(s.substring(9, 13));

		char ch[] = s.toCharArray();
		int index = 5;
		/*
		 * for(int i=9;i<13;i++) { System.out.print(ch[i]); }
		 */

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		System.out.println( Arrays.toString(ch));
		
		String str = Arrays.toString(ch);
		System.out.print(str);

		// System.out.println(ch.toString());

	}
}
