//@author: Chantal Wang, Anand Zorig
package experiment;
import java.util.*;

import clueGame.BoardCell;

public class TestBoard {
	
	private Set<TestBoardCell> targets;
	public TestBoardCell startCell;
	public int pathlength;
	private TestBoardCell[][] grid; 
	private Set<TestBoardCell> visited;
	final static int COLS = 4;
	final static int ROWS = 4;
	
	public void findTargets(TestBoardCell startCell, int path) {
		for(TestBoardCell cell : startCell.getAdjList()) {
			if(!visited.contains(startCell)) {
				visited.add(startCell);
				if(pathlength == 1) {
					targets.add(cell);
				} else {
					findTargets(cell, pathlength -1);
				}
				visited.remove(cell);
			}
		}
	}
	
	public TestBoard(TestBoardCell startCell, int pathlength){ // A constructor that sets up the board.
		this.startCell = startCell;
		this.pathlength = pathlength;
	}
	
	public void calcTargets(TestBoardCell startCell, int pathlength) {
		targets = new HashSet<TestBoardCell>();
		visited = new HashSet<TestBoardCell>();
		visited.add(startCell);
	}
	
	
	public Set<TestBoardCell> getTargets(){
		return targets;
	}
	
	public TestBoardCell getCell( int row, int col ) {
		return grid[row][col];
	}

	public Set<BoardCell> getAdjList(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
