package JavaBasics;

public class Constuctor {

	int a;
	int b;

	Constuctor() {
		a = 1;
		b = 2;
	}

	Constuctor(int x) {
		a = 10;
		b = 20;
	}
	Constuctor(int x,int y) {
		a = 100;
		b = 200;
	}
	public void display() {
		System.out.println("value for a is - " + a+"\n");
		System.out.println("value for b is - " + b+"\n");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constuctor c = new Constuctor();
		Constuctor d = new Constuctor(0);
		Constuctor e = new Constuctor(0,0);
		c.display();
		d.display();
		e.display();
	}

}
