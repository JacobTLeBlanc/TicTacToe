
public class Board {
	// Instance variables
	private String[][] grid;
	
	// Constructors
	public Board(){
		grid = new String[3][3];
	}
	
	// getValue method
	public String getValue(int row, int col) {
		return grid[row][col];
	}
	
}
