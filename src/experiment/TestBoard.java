//@author: Chantal Wang, Anand Zorig
package experiment;
import java.util.*;

public class TestBoard {
	
	public Set<TestBoardCell> targets;
	public TestBoardCell startCell;
	public int pathlength;
	
	public TestBoard(TestBoardCell startCell, int pathlength){ // A constructor that sets up the board.
		this.startCell = startCell;
		this.pathlength = pathlength;
	}
	
	public void calcTargets(TestBoardCell startCell, int pathlength) {
		// TODO: calculates legal targets for a move from startCell of length pathlength.
	}
	
	
	public Set<TestBoardCell> getTargets(){
		// TODO: gets the targets last created by calcTargets()
		return null;
	}
	
	public TestBoardCell getCell( int row, int col ) {
		// TODO: returns the cell from the board at row, col.
		return null;
	}
	
}
