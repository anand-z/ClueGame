package clueGame;
import java.io.*;
import java.util.*;

import experiment.TestBoardCell;


public class Board {
	private FileReader layoutFile = null;
	private FileReader setupFile = null;
	private BoardCell[][] grid; 
	
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
    	 try {
    		 loadSetupConfig();
    		 loadLayoutConfig();
    		 
    	 } catch (BadConfigFormatException e) {
	    			System.out.println(e.getMessage());
	    		}
    	 }
     
     
	public void setConfigFiles(String csvFile, String txtFile) {
		try {
			setupFile = new FileReader(txtFile);
			layoutFile = new FileReader(csvFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
		
	}
	
	
	public Room getRoom(char c) {
		Room r = new Room(c);
		return r;
	}
	
	public Room getRoom(BoardCell cell) {
		Room r = new Room(cell);
		return r;
	}

	public void loadSetupConfig() throws BadConfigFormatException {
		//checks the txt file
		BufferedReader setupBuffer = new BufferedReader(setupFile);
		ArrayList <Character> possibleInitials = new ArrayList <Character>();
		String lineIn = "";
		try {
			lineIn = setupBuffer.readLine();
			lineIn = setupBuffer.readLine();//read in intro and first line
		} catch (IOException e) {}
		while(lineIn != null) {
			possibleInitials.add(lineIn.charAt(lineIn.length()-1)); //grab the last character from the line (the room symbol)
			
			try {
				lineIn = setupBuffer.readLine();
			} catch (IOException e) {}
			}
		
	}
	public void loadLayoutConfig() throws BadConfigFormatException {
		//throws exception if the number of rows != number of columns
		BufferedReader layoutBuffer = new BufferedReader(layoutFile);
		int rows= 0;
		int columns = 0;
		String lineIn = "";
		while(lineIn != null) {
			try {
				lineIn = layoutBuffer.readLine();
			} catch (IOException e) {}
			
			columns = lineIn.length();
			rows++;
		}
		if(columns != rows) {
			throw new BadConfigFormatException();//create new kind of exception
		}
		
	}
	public BoardCell getCell(int i, int j) {
		return grid[i][j];
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
