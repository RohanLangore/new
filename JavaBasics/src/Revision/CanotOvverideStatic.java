package Revision;

class Parent {
	static void display() {
		System.out.println("parent method");
	}
}

class Child extends Parent {

	static void display() {
		System.out.println("child method");
	}
}

public class CanotOvverideStatic {

	public static void main(String[] args) {
		Parent p = new Child();
		p.display();

	}
}
