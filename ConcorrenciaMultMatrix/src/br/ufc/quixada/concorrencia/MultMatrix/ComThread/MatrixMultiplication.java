package br.ufc.quixada.concorrencia.MultMatrix.ComThread;

import br.ufc.quixada.concorrencia.util.RandomMatrix;

public class MatrixMultiplication {

    
    public static int M = 1000;
    public static int N = 1000;
    
    
    public static int [][] A =  RandomMatrix.randomInt(M, N); 
    public static int [][] B = RandomMatrix.randomInt(M, N); ;
    public static int [][] C = new int [M][N];
    public static Auxiliar [][] Threads = new Auxiliar[M][N];
    
    static Runtime runTime = Runtime.getRuntime();
	static int numCores = runTime.availableProcessors();
	public static Auxiliar2 [] cores = new Auxiliar2[numCores];
    
    
    public static void main(String[] args) {      
    	long startTime = System.currentTimeMillis();
    	//TESTE
    		/*for(int i = 0; i < 4; i++){
    			cores[i] = new Auxiliar2(RandomMatrix.randomInt(1000,1000), RandomMatrix.randomInt(1000,1000));
    			cores[i].start();
    			
    	    }
    		for(int i = 0; i < 4; i++){
    			try {
					cores[i].join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}*/
    	//END TESTE
    	
    	for (int i = 0; i<M; i++){
            	
    		for (int j=0; j<N; j++){
                Threads[i][j] = new Auxiliar(i,j,A,B,C);
                Threads[i][j].start();
                
                try {
					Threads[i][j].join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
              
            }
        }
    	long stopTime = System.currentTimeMillis();
    	System.out.println("Numero de cores: " +  numCores);
    	System.out.println("Tempo: " + (stopTime - startTime));
       
    }
}