package JavaBasics;

public class DataT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataT rk = new DataT();
		rk.byteT();
		rk.intT();
		rk.booleanT();
		rk.floatT();
		rk.charT();
		rk.doubleT();

	}

	public void byteT() {
		byte a = 12;
		System.out.println("12 shoud be displayed here - " + a);
	}

	public void intT() {
		int b = 55;
		System.out.println("55 shoud be displayed here - " + b);
	}

	public void booleanT() {
		boolean c = true;
		System.out.println("true shoud be displayed here - " + c);
	}

	public void floatT() {
		float d = 3.14f;
		System.out.println("3.14 shoud be displayed here - " + d);
	}

	public void charT() {
		char letterA = 'A';
		System.out.println(letterA);
	}

	public void doubleT() {
		long f = 8888888;
		System.out.println("8888888 shoud be displayed here - " + f);
	}

}
