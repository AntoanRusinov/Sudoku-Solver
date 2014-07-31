package tests;

import org.testng.annotations.Test;

import sudoku.solver.MatrixHardcode;
import sudoku.solver.Solver;

public class DemoSudoku {

	@Test
	public static void test() {

		MatrixHardcode setMatrixHardcode = new MatrixHardcode();

		int matrix[][] = new int[9][9];
		setMatrixHardcode.fillMatrix(matrix);

		System.out.println("Original matrix: \n\n");
		printMatrix(matrix);

		Solver sudokuSolver = new Solver(matrix);

		sudokuSolver.solve();

		System.out.println("Solution:\n\n");
		printMatrix(matrix);

	}

	public static void printMatrix(int matrix[][]) {
		for (int row = 0; row < matrix[0].length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.print("\n");
		}
	}
}
