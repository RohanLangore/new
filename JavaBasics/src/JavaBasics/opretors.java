package JavaBasics;

public class opretors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		opretors o = new opretors();
		o.add();
		o.div();
		o.mul();
		o.sub();
		o.rem();
	}

	public void add() {
		int a = 10, b = 20;
		System.out.println("addition of these two numbers is -  " + (a + b));
	}

	public void sub() {
		int a = 50, b = 20;
		System.out.println("subtraction of these two numbers is -  " + (a - b));
	}

	public void div() {
		int a = 10, b = 2;
		System.out.println("division of these two numbers is -  " + (a / b));
	}

	public void mul() {
		int a = 10, b = 20;
		System.out.println("multiplicetion of these two numbers is -  " + (a * b));
	}

	public void rem() {
		int a = 22, b = 3;
		System.out.println("reminders of these two numbers is -  " + (a % b));
	}

}
