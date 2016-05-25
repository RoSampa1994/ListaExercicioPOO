package ContaCaractere;

public class ContadorCaracter {
    
    public Integer EspacoContar(String Texto){
        int contador = 0;
        char letra = ' '; 
        for(int i = 0; i < Texto.length(); i++){
            if(Texto.charAt(i) == letra)
                contador++; 
        }    
        return contador;
    }
    public Integer QuabraLinhaContar(String Texto){
        int contador = 0;
        char letra = '\n'; 
        for(int i = 0; i < Texto.length(); i++){
            if(Texto.charAt(i) == letra)
                contador++; 
        }    
        return contador;
    }
    public Integer TabContar(String Texto){
        int contador = 0;
        char letra = '\t'; 
        for(int i = 0; i < Texto.length(); i++){
            if(Texto.charAt(i) == letra)
                contador++; 
        }    
        return contador;
    }    
}
