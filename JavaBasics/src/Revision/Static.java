package Revision;
import java.util.Scanner;
public class Static {

	public static void main(String[] args) {
		Temp t=new Temp();
		System.out.println(t.get_name());
		System.out.println(t.get_students());
		System.out.println(t.get_collagename());
		System.out.println(t.get_id());
	}

}
class Temp {
	private int id=55;
	private String name="Rohan";
	private String students="B.Tech";
	private static String collagename = "COEP";
	
	
	
	
	public void set_collagename(String collagename) {
		this.collagename=collagename;
	}
	public String get_collagename() {
		return collagename;
	}
	
	public void set_id(int id) {
		this.id=id;
	}
	public int get_id() {
		return id ;
	}
	
	public void set_students(String students) {
		this.students=students;
	}
	public String get_students() {
		return students;
	}
	public void set_name(String name) {
		this.name=name;
	}
	public String get_name() {
		return name;
	}

	
}