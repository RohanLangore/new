package assign;
/* class Person extends Object {
int id;
String name;
String organization;
String gender;
public Person(int id, String name, String organization, String gender) {
	this.id = id;
	this.name = name;
	this.organization = organization;
	this.gender = gender; 
/*void display() {
	System.out.println("id is..." + id);
	System.out.println("name is..." + name);
	System.out.println("Organization is..." + organization);
	System.out.println("gender is..." + gender);				}
}*/
class Employee // extends Person
{	int id;
	String name;
	String organization;
	String gender;
	public Employee(int id, String name, String organization, String gender) {
		// super(id, name, organization, gender);
		this.id = id;
		this.name = name;
		this.organization = organization;
		this.gender = gender;
	}
	void display() {
		System.out.println("id is..." + id);
		System.out.println("name is..." + name);
		System.out.println("Organization is..." + organization);
		System.out.println("gender is..." + gender);
	}
}
class Worker extends Employee {
	int id;
	String name;
	String organization;
	String gender;
	public Worker(int id, String name, String organization, String gender) {
		super(1, "sonam", "I.T", "female");
		this.id = id;
		this.name = name;
		this.organization = organization;
		this.gender = gender;
	}
	void display() {
		super.display();
		System.out.println("id is..." + id);
		System.out.println("name is..." + name);
		System.out.println("Organization is..." + organization);
		System.out.println("gender is..." + gender);
	}
}
public class SuperConstr {
	public static void main(String[] args) {
		Worker e = new Worker(101, "Ram", "worker", "Male");
		e.display();
	}
}