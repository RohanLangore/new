package assign;

public class Game {
	String game_name;
	String country;
	String state;

	Game() {
		this("Cricket", "India");
		System.out.println("Default constructor");
	}

	Game(String game_name, String country) {
		this("Maharashtra");
		this.game_name = game_name;
		this.country = country;
	}

	Game(String state) {
		this.state = state;
	}

	void display() {
		System.out.println("game name = " + game_name);
		System.out.println("Country = " + country);
		System.out.println("State = " + state);
	}

	public static void main(String[] args) {
		Game g1 = new Game();
		g1.display();
	}
}
