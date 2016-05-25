package Fibonacci;

import Util.LeitorTXT;

public class Principal {

	public static void main(String[] args) {
            Fibonacci Fibo;
            Fibo = new Fibonacci();
            Fibo.FibonacciGerar();
            System.out.println("O número escolhido é: " + Fibo.getFibo(10));
	}
}
