package assign;

 
public class Car {
	static String model;
	int carsold;
	
	
	
	static void display() {
		String model ="inova";
		int carsold=10;
		System.out.println(carsold+" "+model);
	}
	void show() {
		String model="Ertiga";
		int carsold=20;
		System.out.println(carsold+" "+model);
	}
	public static void main(String[] args) {
		
		
		display();
		Car k=new Car();
		k.show();

	}

}
