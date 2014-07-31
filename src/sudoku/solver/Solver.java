package sudoku.solver;

import java.util.LinkedList;
import java.util.Set;

public class Solver {
	private final LinkedList<Point<Integer, Integer>> emptyPoints;

	final int matrix[][];

	public Solver(final int matrix[][]) {
		this.matrix = matrix;
		this.emptyPoints = getEmptyPoints();
	}

	public void solve() {
		populate(0);
	}

	private LinkedList<Point<Integer, Integer>> getEmptyPoints() {
		return EmptyPointsUtils.getEmptyPoints(matrix);
	}

	private Set<Integer> getPossibleSolutions(
			final Point<Integer, Integer> currentPoint) {
		return PossibleSolutionsUtils
				.getPossibleSolutions(currentPoint, matrix);
	}

	private boolean populate(final int index) {

		Point<Integer, Integer> currentPoint = null;

		if (index < emptyPoints.size()) {
			currentPoint = this.emptyPoints.get(index);
		} else {
			return true;
		}

		final Set<Integer> possibleSolutions = getPossibleSolutions(currentPoint);

		if (possibleSolutions.isEmpty()) {
			return false;
		} else {

			boolean hasBraked = false;

			for (Integer solution : possibleSolutions) {
				this.matrix[currentPoint.getY()][currentPoint.getX()] = solution;

				if (populate(index + 1)) {
					hasBraked = true;
					break;
				}
			}

			if (hasBraked) {
				return true;
			} else {
				this.matrix[currentPoint.getY()][currentPoint.getX()] = 0;
				return false;
			}
		}
	}
}
