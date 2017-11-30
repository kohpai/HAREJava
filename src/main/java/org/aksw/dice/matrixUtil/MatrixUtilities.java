package org.aksw.dice.matrixUtil;

import no.uib.cipr.matrix.sparse.LinkedSparseMatrix;

public class MatrixUtilities {

	void printSparseMat(String name, LinkedSparseMatrix m) {
		System.out.println("---------------------");
		System.out.println(name);
		System.out.println("---------------------");
		int rows = m.numRows();
		int cols = m.numColumns();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.printf("%.2f" + " \t", m.get(i, j));
			}
			System.out.println();
		}
		System.out.println("---------------------");
		System.out.println("---------------------");

	}

}
