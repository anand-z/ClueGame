package clueGame;

public class Room {
	String name = "";
	char initial;
	
	public Room(char _initial) {
		this.initial = _initial;
	}
	
	public Room(BoardCell _cell) {
		
	}
	
	public String getName() {
		return name;
	}

	public BoardCell getLabelCell() {
		// TODO Auto-generated method stub
		return null;
	}

	public BoardCell getCenterCell() {
		// TODO Auto-generated method stub
		return null;
	}
}
