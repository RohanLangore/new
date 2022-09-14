package Rohan;

public class Cycle {
	int cycleno;
	int noofwheels;
	
	public Cycle() {
		System.out.println(" I AM A DEFAULT CONSRUCTOR ");
	}
	
	public Cycle (int cn,int now) {
		this();
		System.out.println(" I AM A ANOTHER CONSRUCTOR ");
		cycleno = cn;
		noofwheels = now;
	}
	
	public void display() {
		System.out.println(cycleno+" "+noofwheels );
	}
	
	
	

	public static void main(String[] args) {
		
		Cycle d1 =new Cycle(10,20);
		d1.display();
		
	}

}
