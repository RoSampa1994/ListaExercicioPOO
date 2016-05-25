package Criptografia;

import javax.crypto.*;
import javax.crypto.spec.*;

public class Principal {

    public static void main(String[] args) {
        Cripta Encriptador = new Cripta();
        Encriptador.Crypta("Rodrigo", "1234556789009876");
        System.out.println("Mensagem Criptografada: " + Encriptador.getMensagemencriptada().toString());
    }
}
