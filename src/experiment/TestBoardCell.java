//@author: Chantal Wang, Anand Zorig
package experiment;
import java.util.*;

public class TestBoardCell {
	private int row, column;
	private boolean room, occupied;
	public Set<TestBoardCell> getAdjList;
	
	public TestBoardCell(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public boolean isRoom() {
		return room;
	}

	public void setRoom(boolean room) {
		this.room = room;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	

	
}
