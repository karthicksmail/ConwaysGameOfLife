/**
 * 
 */
package com.karthicksmail;

/**
 * @author karthicksmail
 *
 */
import java.util.ArrayList;
import java.util.List;

public class Grid {
	List<Cell> gridCellList = new ArrayList<Cell>();
	
	public Grid (int row, int col) {
		
		for (int i = 0; i < row; i++) {
			for (int a = 0; a < col; a++) {
			Cell cell = new Cell();
			addCell(cell);
			}
		}
	}
	
	private void addCell(final Cell cell) {
		gridCellList.add(cell);
	}

	public int getCellListSize() {
		return gridCellList.size();
	}

	public void setCellStatus(int row, int col, boolean status) {
		gridCellList.get(row * 10 + col).setAliveState(status);
		
	}

	public boolean getIsCellAlive(int row, int col) {
		return gridCellList.get(row * 10 + col).isAlive();
	}

	public int getCountOfAliveNeighbors(int row, int col) {
		int count = 0;
		for (int r = row - 1; r <= row + 1; r++) {
			for (int c = col - 1; c <= col + 1; c++) {
				System.out.println(r + " " + c + " " + gridCellList.get(r * 10 + c).isAlive());
				if (r == row && c == col) {
					continue;
				} else {
					if (gridCellList.get(r * 10 + c).isAlive()) {
						System.out.println("Incrementing count");
						count++;
					}
				}
			}
		}
		return count;
	}

	public boolean isCellUnderPopulated(int row, int col) {
		if (getCountOfAliveNeighbors(row, col) < 2) {
			return true;
		}
		return false;
	}

	public void fixCellStatus(int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
