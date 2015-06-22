package br.ufc.quixada.concorrencia.MultMatrix.SemThread;

import br.ufc.quixada.concorrencia.util.RandomMatrix;

public class MatrixMult {
	
	
	 public static double[][] multiply(double[][] A, double[][] B) {
	        int mA = A.length;
	        int nA = A[0].length;
	        int mB = B.length;
	        int nB = B[0].length;
	        if (nA != mB) throw new RuntimeException("Matix com tamanho INVALIDO!!");
	        double[][] C = new double[mA][nB];
	        for (int i = 0; i < mA; i++)
	            for (int j = 0; j < nB; j++)
	                for (int k = 0; k < nA; k++)
	                    C[i][j] += (A[i][k] * B[k][j]);
	        return C;
	    }
	 
	 public static void main(String[] args) {
		 long startTime = System.currentTimeMillis();
		 multiply(RandomMatrix.random(1000, 1000), RandomMatrix.random(1000, 1000));
		 long stopTime = System.currentTimeMillis();
		 
		 System.out.println(stopTime - startTime);
	}
}
