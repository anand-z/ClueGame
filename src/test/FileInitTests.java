package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clueGame.*;
import clueGame.Room;

class FileInitTests {

	// Constants that I will use to test whether the file was loaded correctly
		public static final int LEGEND_SIZE = 11;
		public static final int NUM_ROWS = 24;
		public static final int NUM_COLUMNS = 25;

		// NOTE: I made Board static because I only want to set it up one
		// time (using @BeforeAll), no need to do setup before each test.
		private static Board board;

		@BeforeAll
		public static void setUp() {
			// Board is singleton, get the only instance
			board = Board.getInstance();
			// set the file names to use my config files
			board.setConfigFiles("ClueLayout.csv", "ClueSetup.txt");
			// Initialize will load BOTH config files
			board.initialize();
		}
		
		@Test
		public void testRoomLabels() {
			// To ensure data is correctly loaded, test retrieving a few rooms
			// from the hash, including the first and last in the file and a few others
			assertEquals("Captain America", board.getRoom('C').getName() );
			assertEquals("Iron Man", board.getRoom('I').getName() );
			assertEquals("Black Widow", board.getRoom('B').getName() );
			assertEquals("Meeting Room", board.getRoom('R').getName() );
			assertEquals("Gym", board.getRoom('G').getName() );
			assertEquals("Walkway", board.getRoom('W').getName() );
		}
		
		
		@Test
		public void testDoorDirections() {
			BoardCell cell = new BoardCell(8,3); //door into one of the rooms
			assertTrue(cell.isDoorway());
			assertEquals(cell.getDoorDirection(), DoorDirection.UP);
			
			cell = new BoardCell(12,4);
			assertTrue(cell.isDoorway());
			assertEquals(cell.getDoorDirection(), DoorDirection.LEFT);
			
			cell = new BoardCell(22,4);
			assertTrue(cell.isDoorway());
			assertEquals(cell.getDoorDirection(), DoorDirection.RIGHT);
			
			cell = new BoardCell(12,18);
			assertTrue(cell.isDoorway());
			assertEquals(cell.getDoorDirection(), DoorDirection.DOWN);
		}
		
		@Test
		public void unusedSpace() { //Determine if unused space is ahead
			BoardCell cell = new BoardCell(0,10);
			Room room = board.getRoom('X'); // <-- find the room and return it's name
			assertEquals( room.getName(), "Unused" );
		}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

