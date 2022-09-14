package Rohan;

public class Test {
static int num;
static {
	System.out.println("static block");
}
static void m1() {
	System.out.println("static - m1 method");
}
	
	public static void main(String[] args) {
		System.out.println(num);
		m1();
	}

}
