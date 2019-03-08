
public class Player {
	// Instance variables
	String name;
	String team;
	
	// Constructors
	public Player(){}
	
	public Player(String name, String team) {
		this.name = name;
		this.team = team;
	}
	
	// Get methods
	public String getName() { return this.name; }
	public String getTeam() { return this.team; }
	
	// Set methods
	public void setName( String name ) { this.name = name; }
	public void setTeam( String team ) { this.team = team; }
	
	// pickSpot method
	public int[] pickSpot() {
		int[] spot = new int[2];
		spot[0] = (int) Math.random() * 3;
		spot[1] = (int) Math.random() * 3;
		return spot;
	}
	
	// randName method
	public void randName() {
		String[] names = {"Matt", "Brad", "Kaitlyn", "Brittany", "Jimmy"};
		int rand = (int) Math.random() * 5;
		this.name = names[rand];
	}
	
	// toString method
	public String toString() { return this.name + " on team: " + this.team; };
	
}
