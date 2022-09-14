package assign;

public class students {
	int id = 20;
	String name = "ram";

	void displayData() {
		id = 40;
		name = "rohan";
		System.out.println(id);
		System.out.println(name);
	}

	int getid() {
		return id;
	}

	public static void main(String[] args) {
		students s = new students();
		s.displayData();
		System.out.println(s.getid());
	}
}
