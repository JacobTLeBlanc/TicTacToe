
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
		String board = " " + this.grid[0][0] + " | " + this.grid[0][1] + " | " + this.grid[0][2] + " \n" +
					   "-----------" + "\n" +
					   " " + this.grid[1][0] + " | " + this.grid[1][1] + " | " + this.grid[1][2] + " \n" +
					   "-----------" + "\n" +
					   " " + this.grid[2][0] + " | " + this.grid[2][1] + " | " + this.grid[2][2] + " \n" ;
		return board;
					   
	}
	
	// checkWinner
	public boolean checkWinner(String s) {
		for (int i = 0; i < 3; i++) {
			if (grid[i][0].equals(grid[i][1]) && grid[i][2].equals(grid[i][0]) && grid[i][0].equals(s)) {
				return true;
			}
			if (grid[0][i].equals(grid[1][i]) && grid[2][i].equals(grid[0][i]) && s.equals(grid[0][i])) {
				return true;
			}
		}
		if (grid[0][0].equals(grid[1][1]) && grid[2][2].equals(grid[0][0]) && s.equals(grid[0][0])) {
			return true;
		}
		if (grid[0][2].equals(grid[1][1]) && grid[2][0].equals(grid[0][2]) && s.equals(grid[1][1])) {
			return true;
		}
		return false;
	}
	
	// checkDraw 
	public boolean checkDraw() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (grid[i][j] == " ") {
					return false;
				}
			}
		}
		return true;
	}
}
