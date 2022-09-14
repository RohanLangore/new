package excep;

public class EceptionPropagation {
	void method4() {
		System.out.println("method4");
	}

	void method3() throws ArithmeticException {

		int div = 10 / 0;
		System.out.println("method3");

		method4();
	}

	void method2() {

		method3();
		System.out.println("method2");
	}

	void method1() {
		method2();
		System.out.println("method2");
	}

	public static void main(String[] args) {
		EceptionPropagation e = new EceptionPropagation();

		e.method1();

		System.out.println("Rest of the code");

	}

}
