package sudoku.solver;

public class MatrixHardcode {
	public void fillMatrix(int matrix[][]) {

		matrix[0][0] = 3;
		matrix[0][2] = 1;
		matrix[0][4] = 7;
		matrix[0][5] = 9;
		matrix[0][7] = 2;
		matrix[0][8] = 5;

		matrix[1][3] = 6;
		matrix[1][6] = 4;
		matrix[1][7] = 1;
		matrix[1][8] = 7;

		matrix[2][4] = 1;
		matrix[2][5] = 5;
		matrix[2][6] = 3;

		matrix[3][1] = 9;
		matrix[3][4] = 4;
		matrix[3][5] = 7;
		matrix[3][8] = 2;

		matrix[4][2] = 4;
		matrix[4][3] = 3;
		matrix[4][5] = 8;
		matrix[4][7] = 7;

		matrix[5][1] = 8;
		matrix[5][3] = 9;
		matrix[5][4] = 6;
		matrix[5][6] = 5;
		matrix[5][7] = 3;

		matrix[6][0] = 7;
		matrix[6][2] = 5;
		matrix[6][4] = 9;
		matrix[6][5] = 6;
		matrix[6][7] = 4;
		matrix[6][8] = 8;

		matrix[7][0] = 2;
		matrix[7][1] = 1;
		matrix[7][3] = 5;
		matrix[7][6] = 7;
		matrix[7][8] = 6;

		matrix[8][1] = 4;
		matrix[8][3] = 7;
		matrix[8][5] = 1;
		matrix[8][6] = 2;
		matrix[8][7] = 5;

	}
}
