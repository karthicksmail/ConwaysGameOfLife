package com.karthicksmail;

import org.junit.Test;
import org.junit.Assert;

public class GridTest {
	@Test
	public void testAddCellOnGrid() {
		Grid grid = new Grid(10, 10);
		
		Assert.assertEquals(grid.getCellListSize(), 100);
	}
	
	@Test
	public void testMakeCellAlive() {
		Grid grid = new Grid(10, 10);
		grid.setCellStatus(4, 5, true);
		Assert.assertEquals(grid.getIsCellAlive(4, 5), true);
	}

	@Test
	public void testGetCountOfAliveNeighbors() {
		Grid grid = new Grid(10, 10);
		grid.setCellStatus(4,  5, true);
		grid.setCellStatus(4, 6, true);
		grid.setCellStatus(4, 7, true);
		Assert.assertEquals(2, grid.getCountOfAliveNeighbors(3, 5));
	}
	
	@Test
	public void testIsFieldUnderPopulated() {
		Grid grid = new Grid(10, 10);
		grid.setCellStatus(4,  5, true);
		Assert.assertTrue(grid.isCellUnderPopulated(3,5));
	}

	@Test
	public void testIsFieldIsNotUnderPopulated() {
		Grid grid = new Grid(10, 10);
		grid.setCellStatus(2,  5, true);
		grid.setCellStatus(4,  5, true);
		grid.setCellStatus(4,  6, true);
		Assert.assertFalse(grid.isCellUnderPopulated(3,5));
	}
}
