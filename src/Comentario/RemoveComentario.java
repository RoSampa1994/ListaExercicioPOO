package Comentario;

public class RemoveComentario {
    public String Remover(String Mensagem){
        Mensagem = Mensagem.replaceAll("(?s)/\\*.*?\\*/","");   
        System.out.println(Mensagem);
        return Mensagem;
    }
}
