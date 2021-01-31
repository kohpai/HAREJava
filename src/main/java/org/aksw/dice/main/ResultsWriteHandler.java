package org.aksw.dice.main;

import org.aksw.dice.HARE.HARERank;
import org.aksw.dice.parallel.HARE.HARERankParallel;
import org.aksw.dice.parallel.reader.RDFReadWriteHandler;
import org.apache.jena.rdf.model.Model;

public class ResultsWriteHandler {
  public static void main(String[] args) {
    String filename = null;
    if (args.length == 0) {
      System.out.println("no arguments were given.");
    } else if (args[0].equals("-f")) {
      filename = args[1];
      RDFReadWriteHandler reader = new RDFReadWriteHandler();
      Model readmodel = reader.readData(filename);
      RDFReadWriteHandler write = new RDFReadWriteHandler();
      //      HARERank hrTester = new HARERank(readmodel);
      HARERankParallel hrTester = new HARERankParallel(readmodel);
      HARERank rank = hrTester.getrank();
      rank.calculateRank();
      write.writeFilteredTriples(
          rank.getS_t_Final(), rank.getMatrxUtil().getTripleList(), "custom1");
      //      write.writeRDFResults(
      //          rank.getS_n_Final(),
      //          rank.getS_t_Final(),
      //          rank.getMatrxUtil().getTripleList(),
      //          rank.getMatrxUtil().getEntityList(),
      //          "test");
    }
  }
}
