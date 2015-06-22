package br.ufc.quixada.concorrencia.MultMatrix.ComThread;

public class Auxiliar2 extends Thread {
	
	int mA;
    int nA;
    int mB;
    int nB;
    int[][] C;
    int[][] A;
    int[][] B;
	public Auxiliar2(int[][] A, int[][] B) {
		 mA = A.length;
         nA = A[0].length;
         mB = B.length;
         nB = B[0].length;
         C = new int[mA][nB];
         this.A = A;
         this.B = B;
	}
	
	@Override
	public void run() {
			  for (int i = 0; i < mA; i++)
	            for (int j = 0; j < nB; j++)
	                for (int k = 0; k < nA; k++)
	                    C[i][j] += (A[i][k] * B[k][j]);
	       
	    
	}
}
