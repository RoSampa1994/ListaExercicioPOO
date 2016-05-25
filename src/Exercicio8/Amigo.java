package Exercicio8;

import java.util.Scanner;

public class Amigo {
    private int primeironumero;
    private int segundonumero;
    public int getPrimeironumero() {
        return primeironumero;
    }

    public void setPrimeironumero(int primeironumero) {
        this.primeironumero = primeironumero;
    }

    public int getSegundonumero() {
        return segundonumero;
    }

    public void setSegundonumero(int segundonumero) {
        this.segundonumero = segundonumero;
    }    
    public Boolean verificar(){
    
        int Somaprimeiro=0, somasegundo = 0;
        for(int i=1;i<primeironumero;i++){  // for para sumar todos los divisores propios de primeironumero
             if(primeironumero % i==0){
                Somaprimeiro=Somaprimeiro+i;
                System.out.println("Primeira soma " + Somaprimeiro);
             }
        }
        // si la Soma de los divisores de primeironumero es igual a segundonumero
        if(Somaprimeiro==segundonumero){
           for(int i=1;i<segundonumero;i++){  // sumo los divisores propios de segundonumero
                if(segundonumero % i==0){
                   somasegundo=somasegundo + i;
                   System.out.println(somasegundo);
               }
           }
           if(somasegundo==primeironumero){
               return true;
           }else{
               return false;
           }
        }        
        else{
            return false;
        }        
    }
}
