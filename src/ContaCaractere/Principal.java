package ContaCaractere;
import Util.LeitorTXT;

public class Principal {
	public static void main(String[] args) {
            String Texto;
            LeitorTXT leitor = new LeitorTXT();;
            Texto = leitor.Ler("/home/rodrigo/Área de Trabalho/teste.txt");
            ContadorCaracter contador = new ContadorCaracter();
            System.out.println(contador.EspacoContar(Texto));
            System.out.println(contador.TabContar(Texto));
            System.out.println(contador.QuabraLinhaContar(Texto));
	}      
}
