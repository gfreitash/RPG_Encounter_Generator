package complicacao.savageworlds;

import core.Complicacao;
import core.Membro;

public class Desastrado extends Complicacao {
	public static final String nome = "Desastrado";
	public static final String desc = "Algumas pessoas simplesmente não são boas " + 
			"com dispositivos modernos. Personagens com " + 
			"este defeito sempre sofrem uma penalidade de -2 " +  
			"na perícia Consertar. Além disso, ao usar um " + 
			"dispositivo mecânico ou eletrônico, uma rolagem " + 
			"de 1 no seu dado de perícia (independente do " + 
			"seu Dado Selvagem) significa que o dispositivo " + 
			"foi quebrado. Reparar esse item normalmente " + 
			"requer uma rolagem de Consertar com -2 e 1d6 " + 
			"horas para o reparo.";
	public static final String tipoPossivel[] = {"Menor"};
	
	public Desastrado() {
		super();
	}
	
	public Desastrado(String tipo, Membro m) {
		super(tipo);
	}

}
