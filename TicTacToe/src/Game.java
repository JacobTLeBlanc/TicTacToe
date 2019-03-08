
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
	
	// delay method
	public void delay(int n) {
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// newSpot method
	public void newSpot(Player p) {
		int[] rand = p.pickSpot();
		if (brd.getValue(rand[0], rand[1]) == " ") {
			brd.setValue(rand[0], rand[1], p.getTeam());
		} else {
			this.newSpot(p);
		}
	}
	
	// makeMove
	public void makeMove(Player p) {
		System.out.println("It's " + p.getName() + "'s Turn" + "\n");
		this.delay(500);
		this.newSpot(p);
		System.out.println(this.brd);
		this.delay(1000);
	}
	
	// winner method
	public void winner(Player p) {
		System.out.print(p.getName() + " Wins!");
	}
	
	// play method
	public void play() {
		
		p1.randName();
		p2.randName();
		
		System.out.println(p1.getName() + " is '" + p1.getTeam() + "'");
		System.out.println(p2.getName() + " is '" + p2.getTeam() + "'");
		System.out.println();
		this.delay(1000);
		
		boolean gameOn = true;
		
		while (gameOn) {
		
			// Player 1 goes first
			this.makeMove(p1);
			
			// Check if player 1 won
			if (this.brd.checkWinner(p1.getTeam())) {
				gameOn = false;
				this.winner(p1);
				continue;
			}
			
			// Check for draw
			if (this.brd.checkDraw()) {
				gameOn = false;
				System.out.println("Draw");
				continue;
			}
			
			// Player 2 
			this.makeMove(p2);
			
			// Check if player 2 won
			if (this.brd.checkWinner(p2.getTeam())) {
				gameOn = false;
				this.winner(p2);
			}
		}
	}
}
