package string1;

public class Replace1 {
	public static void main(String[] args) {
		String s = "abc@gmail.com,abc@hotmail.com";
		
		System.out.println(s.replace('l', 'v'));
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'l') {
				ch[i] = 'v';
			}
			System.out.println(ch[i]);
		}

		System.out.println(s.replace("mail", "abcd"));
		System.out.println(s.replaceAll("@", "@@"));
		System.out.println(s.replaceFirst("@", "@@"));

	}
}
