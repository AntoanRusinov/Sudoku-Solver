package tests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

import sudoku.solver.MatrixHardcode;
import sudoku.solver.Point;
import sudoku.solver.PossibleSolutionsUtils;

public class GetPossibleSolutionsTest {

	@Test
	public static void testPossibleSolutionsForCell() {

		MatrixHardcode setMatrixHardcode = new MatrixHardcode();

		int matrix[][] = new int[9][9];
		setMatrixHardcode.fillMatrix(matrix);

		// Test for 0,0 block
		Point<Integer, Integer> p1 = new Point<Integer, Integer>(1, 0);

		Set<Integer> resultSet1 = PossibleSolutionsUtils.getPossibleSolutions(
				p1, matrix);

		Set<Integer> correctSet1 = new HashSet<Integer>();
		correctSet1.addAll(Arrays.asList(new Integer[] { 6 }));

		assert resultSet1.equals(correctSet1);

		// Test for 0,1 block
		Point<Integer, Integer> p2 = new Point<Integer, Integer>(4, 1);

		Set<Integer> resultSet2 = PossibleSolutionsUtils.getPossibleSolutions(
				p2, matrix);

		Set<Integer> correctSet2 = new HashSet<Integer>();
		correctSet2.addAll(Arrays.asList(new Integer[] { 2, 3, 8 }));

		assert resultSet2.equals(correctSet2);

		// Test for 0,2 block
		Point<Integer, Integer> p3 = new Point<Integer, Integer>(8, 2);

		Set<Integer> resultSet3 = PossibleSolutionsUtils.getPossibleSolutions(
				p3, matrix);

		Set<Integer> correctSet3 = new HashSet<Integer>();
		correctSet3.addAll(Arrays.asList(new Integer[] { 9 }));

		assert resultSet3.equals(correctSet3);

		// Test for 1,0 block
		Point<Integer, Integer> p4 = new Point<Integer, Integer>(2, 5);

		Set<Integer> resultSet4 = PossibleSolutionsUtils.getPossibleSolutions(
				p4, matrix);

		Set<Integer> correctSet4 = new HashSet<Integer>();
		correctSet4.addAll(Arrays.asList(new Integer[] { 2, 7 }));

		assert resultSet4.equals(correctSet4);

		// Test for 1,1 block
		Point<Integer, Integer> p5 = new Point<Integer, Integer>(5, 5);

		Set<Integer> resultSet5 = PossibleSolutionsUtils.getPossibleSolutions(
				p5, matrix);

		Set<Integer> correctSet5 = new HashSet<Integer>();
		correctSet5.addAll(Arrays.asList(new Integer[] { 2 }));

		assert resultSet5.equals(correctSet5);

		// Test for 1,2 block
		Point<Integer, Integer> p6 = new Point<Integer, Integer>(7, 3);

		Set<Integer> resultSet6 = PossibleSolutionsUtils.getPossibleSolutions(
				p6, matrix);

		Set<Integer> correctSet6 = new HashSet<Integer>();
		correctSet6.addAll(Arrays.asList(new Integer[] { 6, 8 }));

		assert resultSet6.equals(correctSet6);

		// Test for 2,0 block
		Point<Integer, Integer> p7 = new Point<Integer, Integer>(0, 8);

		Set<Integer> resultSet7 = PossibleSolutionsUtils.getPossibleSolutions(
				p7, matrix);

		Set<Integer> correctSet7 = new HashSet<Integer>();
		correctSet7.addAll(Arrays.asList(new Integer[] { 6, 8, 9 }));

		assert resultSet7.equals(correctSet7);

		// Test for 2,1 block
		Point<Integer, Integer> p8 = new Point<Integer, Integer>(4, 8);

		Set<Integer> resultSet8 = PossibleSolutionsUtils.getPossibleSolutions(
				p8, matrix);

		Set<Integer> correctSet8 = new HashSet<Integer>();
		correctSet8.addAll(Arrays.asList(new Integer[] { 3, 8 }));

		assert resultSet8.equals(correctSet8);

		// Test for 2,2 block
		Point<Integer, Integer> p9 = new Point<Integer, Integer>(8, 8);

		Set<Integer> resultSet9 = PossibleSolutionsUtils.getPossibleSolutions(
				p9, matrix);

		Set<Integer> correctSet9 = new HashSet<Integer>();
		correctSet9.addAll(Arrays.asList(new Integer[] { 3, 9 }));

		assert resultSet9.equals(correctSet9);

	}
}
