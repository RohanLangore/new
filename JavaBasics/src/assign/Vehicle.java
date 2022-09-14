package assign;

public class Vehicle {

	/*
	 * String vname; int speed; String color;
	 */

	void start() {
		System.out.println("vehicle is getting started");
	}

	void stop() {
		System.out.println("vehicle is getting stopped");
	}

}

class Car12 extends Vehicle {
	String vname = "car";
	int speed = 80;
	String color = "blue";

	void show() {
		System.out.println("name is.." + vname);
		System.out.println("speed is.." + speed);
		System.out.println("color is.." + color);

	}

	void show_passenger() {
		System.out.println("5 passengers are allowed");
	}
}

class Auto extends Vehicle {
	String vname = "Auto";
	int speed = 70;
	String color = "black_yellow";

	void show() {
		System.out.println("name is.." + vname);
		System.out.println("speed is.." + speed);
		System.out.println("color is.." + color);

	}

	void show_passenger() {
		System.out.println("3 passengers are allowed");
	}
}
