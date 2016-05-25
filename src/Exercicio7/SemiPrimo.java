package Exercicio7;

public class SemiPrimo {
    private int Numero;

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    
    public Boolean verificar(){
	int TerceiroContador,QuartoContador,SegundoContador,dividendo;
        SegundoContador = 0;
        TerceiroContador= 0;
        QuartoContador = 0;
        //Verifica se mais de um número pode dividir a entrada;
	for (int contador =1; contador <= Numero; contador++) {
		if(Numero % contador == 0){
                    SegundoContador++;
                }
	}
	if (SegundoContador == 2) {
            return false; 
        }
	else{
            SegundoContador = 0;
            for(int contador = 2;contador < Numero; contador++) {
		if (Numero % contador == 0) {
                    dividendo = Numero / contador;
                    SegundoContador++;
                    TerceiroContador=0;
                    for (int contador2 = 1; contador2 <= dividendo; contador2++) {
			if (dividendo % contador2 == 0){
                            TerceiroContador++;
                        }
                    }
                    if (TerceiroContador<=2){
                        QuartoContador++;
                    }
		}
            }
            if (SegundoContador==QuartoContador){
                return true;
            }
            else{
                return false;
            }
	}
    }
}
