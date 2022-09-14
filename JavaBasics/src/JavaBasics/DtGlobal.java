package JavaBasics;

public class DtGlobal {
	boolean a;
	byte b;
	int c;
	long d;
	float e;
	double f;
	int p = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DtGlobal g = new DtGlobal();
		System.out.println("all the default values will be displayed here ");
		g.Display();

	}

	public void Display() {
		System.out.println(p);
		System.out.println("boolean the default values will be displayed here " + a);
		System.out.println("byte the default values will be displayed here " + b);
		System.out.println("int the default values will be displayed here " + c);
		System.out.println("long the default values will be displayed here " + d);
		System.out.println("float the default values will be displayed here " + e);
		System.out.println("double the default values will be displayed here " + f);
		System.out.println("all the default values will be displayed here " + p);

	}

}
