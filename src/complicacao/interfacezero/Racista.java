package complicacao.interfacezero;

import core.Complicacao;

public class Racista extends Complicacao {
	public static final String nome = "Racista";
	public static final String desc = "O personagem não gosta de pessoas de outras raças e " + 
			"credos, acredita que a sua raça é superior. Ele não pode" + 
			"se controlar em menosprezar outras raças em cada oportunidade. " + 
			"Um personagem assumindo a versão Menor tem" + 
			"Carisma -2 entre outras raças. A penalidade aumenta para " + 
			"-4 na Complicação Maior.";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public Racista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Racista(String tipo) {
		super(tipo);
	}
}
