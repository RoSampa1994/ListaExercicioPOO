package Comentario;
import Util.LeitorTXT;

public class Principal {
	public static void main(String[] args) {
            LeitorTXT leitor = new LeitorTXT();
            RemoveComentario Comentarios = new RemoveComentario();
            Comentarios.Remover(leitor.Ler("C:/teste.txt"));
	}    
}
