package Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeitorTXT {
    private String Caminho;

    public void setCaminho(String Caminho) {
        this.Caminho = Caminho;
    }
    /*
    Para utiliza a função abaixo:   
    LeitorTXT teste = new LeitorTXT();
            System.out.println(teste.Ler("/home/rodrigo/Área de Trabalho/teste.txt"));  
    */
  public String LerOLD(String Caminho) {
      String resultado = "";
    try {
      FileReader arquivo = new FileReader(Caminho);
      BufferedReader lerArq = new BufferedReader(arquivo);
      String texto = lerArq.readLine();
      while (texto != null) {
        resultado = resultado + texto;          
        texto = lerArq.readLine();
      }
      arquivo.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }
    return resultado;
  }
  
  public String Ler(String Caminho){
      String Arquivo = "";
      try {
            Arquivo = new Scanner(new File(Caminho)).useDelimiter("SEMDELIMITADOR").next();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeitorTXT.class.getName()).log(Level.SEVERE, null, ex);
        }
  return Arquivo;
  }
}