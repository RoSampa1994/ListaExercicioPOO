package Fibonacci;

public class Fibonacci {
    private int[] fibo = new int[50];

    public int getFibo(int posicao) {
        return fibo[posicao -1];
    }
    
  public void FibonacciGerar(){
	  fibo[0] = 0;
	  fibo[1] = 1;
	  for(int contador=2; contador<50; contador++){ 
		  fibo[contador] = fibo[contador-2] + fibo[contador-1];
	  }
  }
	
}
