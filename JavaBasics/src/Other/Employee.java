package Other;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + name + salary;
	}

	public static void main(String[] args) {
		/*
		 * Employee e1=new Employee(1,"ram",12000); e1.display(); Employee e2=new
		 * Employee(2,"pooja",15000); e2.display();
		 */

		Employee e[] = new Employee[3];// Arrays of object
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter salary");
			int salary = sc.nextInt();
			e[i] = new Employee(id, name, salary);
			// System.out.println(e[i].hashCode());
			System.out.println(e[i]);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(e[i]);

		}

	}

}
