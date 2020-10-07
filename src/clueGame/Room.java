package clueGame;

public class Room {
	String name = "";
	BoardCell initial;
	
	public Room(BoardCell _initial) {
		this.initial = _initial;
	}
	
	public String getName() {
		return name;
	}
}
