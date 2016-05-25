package Criptografia;

import java.security.InvalidKeyException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.*;
import javax.crypto.spec.*;

public class Cripta {
    private byte[] mensagem;
    private byte[] mensagemencriptada;
    private byte[] mensagemdecriptada;
    private byte[] chave;
    
    public byte[] getMensagem() {
        return mensagem;
    }

    public void setMensagem(byte[] mensagem) {
        this.mensagem = mensagem;
    }

    public byte[] getMensagemencriptada() {
        return mensagemencriptada;
    }

    public byte[] getMensagemdecriptada() {
        return mensagemdecriptada;
    }

    public byte[] getChave() {
        return chave;
    }

    public void setChave(byte[] chave) {
        this.chave = chave;
    }

    
    public void Crypta(String Mensagem, String Chave){
        try {
            Cipher Criptografador = Cipher.getInstance("AES/ECB/PKCS5Padding");
            mensagem = Mensagem.getBytes();
            chave = Chave.getBytes();
            try {
                // Encriptando...
                Criptografador.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(chave, "AES"));
            } catch (InvalidKeyException ex) {
                Logger.getLogger(Cripta.class.getName()).log(Level.SEVERE, null, ex);
            }
            mensagemencriptada = Criptografador.doFinal(mensagem);
        } catch (Exception e) {
           e.printStackTrace();
        } 
    }
    public void Decrypta(){
        // Decriptando...
               
        try { 
            Cipher Criptografador = Cipher.getInstance("AES/ECB/PKCS5Padding");             
            Criptografador.init(Cipher.DECRYPT_MODE, new SecretKeySpec(chave, "AES"));
            mensagemdecriptada = Criptografador.doFinal(mensagemencriptada);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
