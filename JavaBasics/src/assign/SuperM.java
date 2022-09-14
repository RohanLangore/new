package assign;

class Parent2 {
	int a = 23;

	void show() {
		System.out.println(a);
	}
}

class Child2 extends Parent2 {
	int a = 24;

	void show() {
		super.show();
		System.out.println(a);
	}
}

public class SuperM {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.show();
	}

}
