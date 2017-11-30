package org.aksw.dice.parallel.HARE;

import org.aksw.dice.matrixUtil.TransitionMatrixUtil;
import org.apache.jena.rdf.model.Model;

public class TransitionMatrixUtilParallel {
	TransitionMatrixUtil matrixUtilParallel;

	public TransitionMatrixUtil getMatrixUtilParallel() {
		return matrixUtilParallel;
	}

	
	public TransitionMatrixUtilParallel(Model data) {
		
		this.matrixUtilParallel = new TransitionMatrixUtil(data);
		
	}

	
}
