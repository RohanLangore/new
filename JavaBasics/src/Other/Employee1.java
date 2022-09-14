package Other;

public class Employee1 extends Object {
	int id;
	String name;
	int salary;

	public Employee1(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + name + salary;
	}

	public static void main(String[] args) {
		Employee1 e = new Employee1(1, "priya", 20000);
		System.out.println(e);

	}
}
