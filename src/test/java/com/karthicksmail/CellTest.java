/**
 * 
 */
package com.karthicksmail;

import org.junit.Test;

/**
 * @author karthicksmail
 *
 */

import org.junit.Assert;

public class CellTest {

	@Test
	public void testInit() {
		Cell cell = new Cell();
		Assert.assertEquals(cell.isAlive(), false);
	}
	
	@Test
	public void testIsAlive() {
		Cell cell = new Cell();
		cell.setAliveState(true);
		Assert.assertEquals(cell.isAlive(), true);
	}
}
