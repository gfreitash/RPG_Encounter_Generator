package complicacao.savageworlds;

import core.Complicacao;

public class Cauteloso extends Complicacao {
	public static final String nome = "Cauteloso";
	public static final String desc = "Algumas pessoas acumulam inteligência " + 
			"demais. Este personagem personifica a cautela " + 
			"excessiva. Ele nunca toma decisões apressadas e " + 
			"gosta de planejar coisas até os mínimos detalhes " + 
			"antes de qualquer ação ser tomada.";
	public static final String tipoPossivel[] = {"Menor"};
	
	public Cauteloso() {
		super(nome, desc, tipoPossivel);
	}
	
	Cauteloso(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
