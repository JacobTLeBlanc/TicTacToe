
public class Game {
	// Instance variables
	Player p1;
	Player p2;
	Board brd;
	
	// Constructor
	public Game() {
		p1 = new Player("P1", "X");
		p2 = new Player("P2", "O");
		brd = new Board();
	}
	
	
}
