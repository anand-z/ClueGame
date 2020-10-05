//@author: Chantal Wang, Anand Zorig
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import experiment.*;
import java.util.*;


public class BoardTestsExp {
	TestBoard board; 
	
	@BeforeEach
	public void setUp() {
		board = new TestBoard(null, 0);
	}

	@Test
	public void testAdjacency() {
		//Testing top left corner first
		TestBoardCell cell = board.getCell(0, 0);
		Set<TestBoardCell> testList = cell.getAdjList;
		Assert.assertTrue(testList.contains(board.getCell(0, 1)));
		Assert.assertTrue(testList.contains(board.getCell(1, 0)));
		Assert.assertEquals(2, testList.size());

		//testing bottom right corner
		cell = board.getCell(3, 3);
		testList = cell.getAdjList;
		Assert.assertTrue(testList.contains(board.getCell(3, 2)));
		Assert.assertTrue(testList.contains(board.getCell(2, 3)));
		Assert.assertEquals(2, testList.size());

		//testing right edge
		cell = board.getCell(0, 3);
		testList = cell.getAdjList;
		Assert.assertTrue(testList.contains(board.getCell(0, 2)));
		Assert.assertTrue(testList.contains(board.getCell(1, 3)));
		Assert.assertEquals(2, testList.size());

		//testing left edge
		cell = board.getCell(3, 0);
		testList = cell.getAdjList;
		Assert.assertTrue(testList.contains(board.getCell(2, 0)));
		Assert.assertTrue(testList.contains(board.getCell(3, 1)));
		Assert.assertEquals(2, testList.size());
	}
	
	@Test
	public void testTargetsNormal() {
		TestBoardCell cell = board.getCell(0, 0);
		board.calcTargets(cell, 3);
		Set <TestBoardCell> targets = board.getTargets();
		//test possible targets created within 3 spaces of cell 0,0
		Assert.assertEquals(6, targets.size());
		Assert.assertTrue(targets.contains(board.getCell(3, 0)));
		Assert.assertTrue(targets.contains(board.getCell(2, 1)));
		Assert.assertTrue(targets.contains(board.getCell(0, 1)));
		Assert.assertTrue(targets.contains(board.getCell(1, 2)));
		Assert.assertTrue(targets.contains(board.getCell(0, 3)));
		Assert.assertTrue(targets.contains(board.getCell(1, 0)));
	}
	
	@Test
	public void testTargetsOccupied() {
		board.getCell(0, 2).setOccupied(true); //test targeting on occupied cell
		board.getCell(1, 2).setRoom(true);//test targeting on room
		
		TestBoardCell cell = board.getCell(0, 3);
		board.calcTargets(cell, 3);
		Set<TestBoardCell> targets = board.getTargets();
		Assert.assertEquals(3, targets.size());
		Assert.assertTrue(targets.contains(board.getCell(1, 2)));
		Assert.assertTrue(targets.contains(board.getCell(2, 2)));
		Assert.assertTrue(targets.contains(board.getCell(3, 3)));
	}
	
	
	

}


