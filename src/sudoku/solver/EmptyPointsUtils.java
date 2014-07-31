package sudoku.solver;

import java.util.LinkedList;

public class EmptyPointsUtils {

	static LinkedList<Point<Integer, Integer>> getEmptyPoints(
			final int[][] matrix) {

		final LinkedList<Point<Integer, Integer>> list = new LinkedList<Point<Integer, Integer>>();

		for (int row = 0; row < matrix[0].length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				if (matrix[row][col] == 0) {
					list.add(new Point<Integer, Integer>(col, row));
				}
			}
		}

		return list;
	}

}
