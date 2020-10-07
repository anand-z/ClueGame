package clueGame;

import java.util.Set;

import experiment.TestBoardCell;

public class BoardCell {
	int row, column;
	boolean room, occupied, doorway;
	public Set<TestBoardCell> getAdjList;
	DoorDirection direction;
	
	public BoardCell(int row, int column) {
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
	
	
	public boolean isDoorway() {
		return this.doorway;
	}
	
	public DoorDirection getDoorDirection() {
		return direction;
	}
	
}
