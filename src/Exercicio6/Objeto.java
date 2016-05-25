package Exercicio6;

public class Objeto {
    private int[] numero = new int[9999999];
    
    public void setNumero(){
        for (int contador = 1000; contador < 10000; contador++){
            numero[contador] = contador;
        }
    }
    public void getNumeros(){
        int par1, par2, real;
        String numeroquebra;
        for (int contador = 1000; contador < 10000; contador++){
            numeroquebra = Integer.toString(numero[contador]);
            String primeironumero = new String(numeroquebra.toCharArray(), 0, 2);
            String segundonumero = new String(numeroquebra.toCharArray(), 2, 2);
            par1 = Integer.parseInt(primeironumero);
            par2 = Integer.parseInt(segundonumero);
            real = par1 + par2;
            real = real * real;
            if (real == numero[contador]){
                System.out.println(numero[contador]);
            }
        }
    }  
}
