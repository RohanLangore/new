package Arrey;
// flawed logic
public class DDArreyPalidrome {
	public static void main(String[] args) {
		int a[] = { 2, 3, 15, 15, 3, 2 };// add 2,2 in arrey and ut still shows same result
		int count = 1;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					break;
				}
			}
		}
		if (count > 1) {
			System.out.println("All Element Are Same");
		} else System.out.println("All Element Are not Same");

	}
}
