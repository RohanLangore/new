package assign;

public class Book {

	public static void main(String[] args) {
		BookOne b=new BookOne();
		System.out.println(b.getBook_price());
		System.out.println(b.getBook_name());
		System.out.println(b.getAuther_name());
	}
}
class BookOne {
	private int book_price=200;
	private String book_name="wings of fire";
	private String auther_name="A.P.J.abdul kalam";
	
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	public int getBook_price() {
		return book_price;
	}
	
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuther_name() {
		return auther_name;
	}
	public void setAuther_name(String auther_name) {
		this.auther_name = auther_name;
	}
	
}