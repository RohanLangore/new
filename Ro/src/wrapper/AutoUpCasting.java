package wrapper;

public class AutoUpCasting {

	static void overloadedMethod(Number N) {
		System.out.println("Number Class Type");
	}

	static void overloadedMethod(double D) {
		System.out.println("Double Wrapper Class Type");
	}

	static void overloadedMethod(Long L) {
		System.out.println("Long Wrapper Class Type");
	}

	public static void main(String[] args) {
		float i = 21.4f;
		overloadedMethod(i);

	}
}
