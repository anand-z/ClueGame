package clueGame;

public class Board {

	
	 private static Board theInstance = new Board();
     // constructor is private to ensure only one can be created
     private Board() {
            super() ;
     }
     // this method returns the only Board
     public static Board getInstance() {
            return theInstance;
     }
     /*
      * initialize the board (since we are using singleton pattern)
      */
     public void initialize(){
     }
	public void setConfigFiles(String csvFile, String txtFile) {
		// TODO Auto-generated method stub
		
	}
	
	public Room getRoom(char c) {
		Room r = new Room(c);
		return r;
	}
	
	public Room getRoom(BoardCell cell) {
		Room r = new Room(cell);
		return r;
	}
	public void loadSetupConfig() {
		// TODO Auto-generated method stub
		
	}
	public void loadLayoutConfig() {
		// TODO Auto-generated method stub
		
	}
	public BoardCell getCell(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	public int getNumRows() {
		int i= 0;
		// TODO Auto-generated method stub
		return i;
	}
	public int getNumColumns() {
		// TODO Auto-generated method stub
		int i= 0;
		return i;
	}
	
	
	
	
}
