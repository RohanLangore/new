package assign;

public class Movie {

	public static void main(String[] args) {
		MovieTicket b=new MovieTicket();
		System.out.println(b.getTicket_cost());
		System.out.println(b.getMovie_catogary());
		System.out.println(b.getMovie_name());
		

	}
}
class MovieTicket{
	private int ticket_cost=300;
	private String movie_name="RRR";
	private String movie_catogary="Action";
	
	public int getTicket_cost() {
		return ticket_cost;
	}
	public void setTicket_cost(int ticket_cost) {
		this.ticket_cost = ticket_cost;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getMovie_catogary() {
		return movie_catogary;
	}
	public void setMovie_catogary(String movie_catogary) {
		this.movie_catogary = movie_catogary;
	}
	
}