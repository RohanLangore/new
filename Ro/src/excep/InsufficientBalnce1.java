package excep;

public class InsufficientBalnce1 extends RuntimeException {
	private static int accno[] = { 1001, 1002, 1003, 1004, 1005 };
	private static String name[] = { "raja rao", "rama rao", "subha rao", "appa rao", "laxmi devi" };
	private static double bal[] = { 10000.00, 12000.00, 5600.50, 999.00, 1100.55 };
	static int i;

	void accept() throws InsufficientBalance {
		System.out.println("ACCNO " + "\t" + "CUSTOMER" + "\t" + "BALANCE");

		for (i = 0; i < 5; i++) {
			System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);

			if (bal[i] < 1000) {

				throw new InsufficientBalance();

			}
		}
	}
}
