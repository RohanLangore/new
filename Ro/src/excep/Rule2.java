package excep;

import java.io.IOException;

//If the superclass method declares an exception, 
//subclass overridden method can declare same, 
//subclass exception or no exception but cannot
//declare parent exception.

class Base {
	protected void show() throws Exception {
		System.out.println("Parent show method");
	}
}

class Derived extends Base {
	public void show() {
		System.out.println("Child show method");
	}

}

public class Rule2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
