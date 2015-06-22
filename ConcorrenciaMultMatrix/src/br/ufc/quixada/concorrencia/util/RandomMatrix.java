package br.ufc.quixada.concorrencia.util;

public class RandomMatrix {
	
	 public static double[][] random(int m, int n) {
	        double[][] C = new double[m][n];
	        for (int i = 0; i < m; i++)
	            for (int j = 0; j < n; j++)
	                C[i][j] = Math.random();
	        return C;
	    }
	 public static int[][] randomInt(int m, int n) {
	        int[][] C = new int[m][n];
	        for (int i = 0; i < m; i++)
	            for (int j = 0; j < n; j++)
	                C[i][j] = (int) Math.random();
	        return C;
	    }
}
