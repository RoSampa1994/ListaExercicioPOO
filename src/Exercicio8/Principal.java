package Exercicio8;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Amigo amigos = new Amigo();
        amigos.setPrimeironumero(2220);
        amigos.setSegundonumero(284);
        if (amigos.verificar()){
            System.out.println("Ssão amigos");
        }else{
            System.out.println("Não são amigos");
        }
    }
}