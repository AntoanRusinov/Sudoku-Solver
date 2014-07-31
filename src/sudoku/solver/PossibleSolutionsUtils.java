package sudoku.solver;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PossibleSolutionsUtils {
	public static Set<Integer> getPossibleSolutions(
			final Point<Integer, Integer> currentPoint, final int[][] matrix) {

		Set<Integer> set = new HashSet<Integer>();

		set.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));

		for (int col = 0; col < 9; col++) {

			final int cellValue = matrix[currentPoint.getY()][col];

			if (cellValue > 0) {
				set.remove(cellValue);
			}
		}

		for (int row = 0; row < 9; row++) {

			final int cellValue = matrix[row][currentPoint.getX()];

			if (cellValue > 0) {
				set.remove(cellValue);
			}
		}

		final int beginColumn = 3 * (currentPoint.getX() / 3);
		final int beginRow = 3 * (currentPoint.getY() / 3);

		for (int row = beginRow; row < beginRow + 3; row++) {
			for (int col = beginColumn; col < beginColumn + 3; col++) {
				final int cellValue = matrix[row][col];

				if (cellValue > 0) {
					set.remove(cellValue);
				}
			}
		}

		return set;
	}
}
