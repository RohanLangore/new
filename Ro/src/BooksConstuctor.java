import java.util.Scanner;

public class BooksConstuctor {
		int b_id,price,rating;
		String b_name,auther_name;
		
	void accept(int b_id, String b_name, String auther_name,int price) {
		this.b_id=b_id;
		this.b_name=b_name;
		this.auther_name=auther_name;
		
	}
	void show() {
		System.out.println(" Book id - "+b_id);
		System.out.println(" Books name - "+b_name);
		System.out.println(" Books auther name - "+auther_name);
	}
	
	
	void giverating() {
		System.out.println("1=Excellent 2=good 3=Avrage 4=bad");
		Scanner sc=new Scanner(System.in);
		rating = sc.nextInt();
		switch(rating) {
		case 1:System.out.println("Excellent ");break;
		case 2:System.out.println("Good ");		break;
		case 3:System.out.println("Avrage ");	break;
		case 4:System.out.println("Bad ");		break;
		}
		}
		/* void display() { System.out.println(" Book id - "+b_id);
		  System.out.println(" Books name - "+b_name);
		  System.out.println(" Books auther name - "+auther_name);
		  System.out.println(" Books price - "+price);
		  System.out.println(" Books rating - "+rating); }
		 */
	
	public static void main(String[] args) {
	
		BooksConstuctor b=new BooksConstuctor();
		b.accept(10,"rr","tt",100);
		
		b.giverating();
		b.show();
		//b.display();
	}
}
