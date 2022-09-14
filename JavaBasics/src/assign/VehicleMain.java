package assign;

public class VehicleMain {

	public static void main(String[] args) {
		Car12 c=new Car12();
		c.start();
		c.show();
		c.show_passenger();
		c.stop();
		System.out.println("-----");
		Auto a=new Auto();
		a.start();
		a.show();
		a.show_passenger();
		a.stop();
	
	/*Vehicle v=new Vehicle();
	v.start();
	v.stop();*/

	}

}
