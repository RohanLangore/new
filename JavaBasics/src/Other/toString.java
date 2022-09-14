package Other;

import java.util.Scanner;

public class toString {
	int id;
	String name;
	int salary;
	Department d;

	public toString(int id, String name, int salary, Department d) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.d = d;// 306279ee
	}

	@Override
	public String toString() { // 306279ee
		return id + name + +salary + d.dname;
	}

	public static void main(String[] args) {
		Department d = new Department(1, "I.T");// 306279ee
		toString e[] = new toString[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter salary");
			int salary = sc.nextInt();
			e[i] = new toString(id, name, salary, d);
			// System.out.println(e[i].hashCode());
			// System.out.println(e[i]);
		}

		for (int i = 0; i < 2; i++) {
			System.out.println(e[i]);

		}

	}
}
