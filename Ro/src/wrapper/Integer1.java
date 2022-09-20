package wrapper;
//autoboxing converting primitive to objects
//autounboxing  Converting objects to primitive
public class Integer1 {
	public static void main(String[] args) {
		int a = 10;
		Integer i = a;// autoboxing

		Integer a1 = 20;
		int a12 = a1; // autounboxing

		String s = "abc12";
		int sum = 0;

		String s1 = "123";
		char arr[] = s.toCharArray();

		for (int j = 0; j < arr.length; j++) {
			if (Character.isDigit(arr[j])) {

				int x = Character.getNumericValue(arr[j]);
				sum = sum + x;

			}
		}
		System.out.println("sum is " + sum);

	}
}
