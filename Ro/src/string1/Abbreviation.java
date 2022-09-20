package string1;

public class Abbreviation {
	public static void main(String[] args) {
		String s = "Robert Brettt Roser";
		int space = 0, i;
		char ch[] = s.toCharArray();

		System.out.print(ch[0] + ".");        //R.

		for (i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				if (space < 1)
					System.out.print(ch[i + 1] + ".");  //B.
				space++;

				if (space > 1) { System.out.print(ch[i + 1] );
					break;
				}
				
				}else if (ch[i] != ' ') {
				continue;
			}
		}
		
		for (int j = i + 2; j < ch.length; j++) {
			System.out.print(ch[j]);
		}
	}
}
