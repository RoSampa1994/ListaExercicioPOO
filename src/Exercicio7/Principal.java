package Exercicio7;

public class Principal {
    public static void main(String[] args) {
      SemiPrimo familia = new SemiPrimo();
      familia.setNumero(9);
      if (familia.verificar()) {
        System.out.println("O número é Semi-Primo");
      }else{
        System.out.println("O número não é Semi-Primo");
      }
    }    
}
