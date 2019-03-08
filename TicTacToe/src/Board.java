
public class Board {
	// Instance variables
	private String[][] grid;
	
	// Constructors
	public Board(){
		grid = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = " ";
			}
		}
	}
	
	// getValue method
	public String getValue(int row, int col) {
		return grid[row][col];
	}
	
	// setValue method
	public void setValue(int row, int col, String value) {
		this.grid[row][col] = value;
	}
	
	// toString method
	public String toString() {
		String board = " " + this.grid[0][0] + " | " + this.grid[0][1] + " | " + this.grid[0][1] + " \n" +
					   "-----------" + "\n" +
					   " " + this.grid[1][0] + " | " + this.grid[1][1] + " | " + this.grid[1][1] + " \n" +
					   "-----------" + "\n" +
					   " " + this.grid[1][0] + " | " + this.grid[1][1] + " | " + this.grid[1][1] + " \n" ;
		return board;
					   
	}
	
}
