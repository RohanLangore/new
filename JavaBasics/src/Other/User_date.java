package Other;

public class User_date {
	int yyyy, mm, dd;

	User_date(int yyyy, int mm, int dd) {
		this.yyyy = yyyy;
		this.dd = dd;
		this.mm = mm;

	}

	void display() {
		System.out.println("date is...." + yyyy + "/" + mm + "/" + dd);
	}

	public static void main(String[] args) {

		User_date d = new User_date(2000, 12, 23);
		d.display();

	}
}
