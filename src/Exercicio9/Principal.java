package Exercicio9;


public class Principal {
    public static void main(String[] args){
    PreencherArray thread1 = new PreencherArray();  
    thread1.setId(1);
    PreencherArray thread2 = new PreencherArray();  
    thread2.setId(2);
    Thread t1 = new Thread(thread1);
    t1.start();
    Thread t2 = new Thread(thread2);
    t2.start();            
    }        
}
