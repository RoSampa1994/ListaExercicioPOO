package Exercicio5;

public class PuloNumero {
      private int[] sequencia = new int[1000];
      
    public int getCentessimo(){
        Boolean Pulo1 = true;
        sequencia[0] = 1;
        for(int i = 1; i < 1000; i++){
            if(Pulo1){
                sequencia[i] = sequencia[i-1] + 2;
                Pulo1 = false;
            }else{
                sequencia[i] = sequencia[i-1] + 3;
                Pulo1 = true;                
            }
        }    
        return sequencia[100];
    }
}
