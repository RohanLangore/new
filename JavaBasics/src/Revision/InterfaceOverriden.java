package Revision;

interface a { // keyword
	public default void display() {
		System.out.println("dafault method of a");
	}
}

interface b {
	default void display() {
		System.out.println("dafault method of b");
	}
}

class OvveridenClass implements a, b {

	@Override
	public void display() {
		System.out.println("class implementation");
		a.super.display();
		b.super.display();
	}

}

public class InterfaceOverriden {
	public static void main(String[] args) {
		OvveridenClass o = new OvveridenClass();
		o.display();
	}
}
