import java.util.Scanner;
public class Book {
	int b_id,price,rating;
	String b_name,auther_name;
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Book id - ");
		b_id = sc.nextInt(); 
		System.out.print("Enter Book price - ");
		price = sc.nextInt(); 
		System.out.println("Enter Book rating  - ");
		System.out.println("1=Excellent 2=good 3=Avrage 4=bad");
		rating = sc.nextInt(); 
		System.out.print("Enter Book Name - ");
		b_name = sc.next(); 
		System.out.print("Enter Books auther name - ");
		auther_name = sc.next(); 
	}
	void giverating() {
		switch(rating) {
		case 1:System.out.println("Excellent ");break;
		case 2:System.out.println("Good ");		break;
		case 3:System.out.println("Avrage ");	break;
		case 4:System.out.println("Bad ");		break;
		}
		}
	void display() {
		System.out.println(" Book id - "+b_id);
		System.out.println(" Books name - "+b_name);
		System.out.println(" Books auther name - "+auther_name);
		System.out.println(" Books price - "+price);
		System.out.println(" Books rating - "+rating);
	}
	public static void main(String[] args) {
		Book b=new Book();
		b.accept();
		b.giverating();
		b.display();
	}

}
