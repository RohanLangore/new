package string1;

public class EmailValidOrNot {
	public static void main(String[] args) {
		String s = "Dyaneshwar@gmail.com";
		char arr[] = s.toCharArray();
		int flag1 = 1, flag2 = 1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '@') {
				flag1 = 1;
			}
			if (arr[i] == '.') {
				flag2 = 1;
			}
		}
		if (flag1 == 1 && flag2 == 1) {
			System.out.println("Email id is valid");
		} else
			System.out.println("Email id not valid");
	}
}
