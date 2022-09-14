package assign;

class Parent1 {
	int a = 10;

}

class Child1 extends Parent1 {
	int a = 20;

	void show() {
		System.out.println(super.a);
		System.out.println(a);
	}
}

public class Superkey {

	public static void main(String[] args) {
		Child1 c = new Child1();
		c.show();
	}

}
