package excep;

//If the superclass method does not declare an exception, 
//subclass overridden method cannot declare the checked 
//exception but it can declare unchecked exception.
class Parent {
	void show() {
		System.out.println("Parent show method");
	}
}

class Child extends Parent {
	void show() throws ArithmeticException {
		System.out.println("Child show method");
	}

}

public class Rule1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
