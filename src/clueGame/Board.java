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
	
	public Room getRoom(BoardCell c) {
		Room r = new Room(c);
		return r;
	}
	
	
}
