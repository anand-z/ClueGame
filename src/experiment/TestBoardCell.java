//@author: Chantal Wang, Anand Zorig
package experiment;
import java.util.*;

public class TestBoardCell {
	private int row, column;
	private boolean room, occupied;
	public Set<TestBoardCell> adjList;
	
	public TestBoardCell(int row, int column) {
		this.row = row;
		this.column = column;
		adjList = new HashSet<TestBoardCell>();
	}
	
	public void addAdj(TestBoardCell cell) {
		adjList.add(cell);
	}
	
	public Set<TestBoardCell> getAdjList(){
		return adjList;
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
