package Revision;

interface first1 {
	public static final int a = 10;

	public abstract void m1();

	void m2();

	default void m3() {
		System.out.println("adding new features");
	}

	static void display() {
		System.out.println(a);
	}
}

class AA implements first1 {

	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

}

class BB implements first1 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

}

class CC implements first1 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

}

public class DefaultInterface {
	public static void main(String[] args) {
		first1 f = new AA();
		f.m1();
		f.m2();
		f.m3();
		first1.display();

	}
}
