package complicacao.interfacezero;

import core.Complicacao;

public class Racista extends Complicacao {
	public Racista(String tipo) {
		super("Racista", "O personagem não gosta de pessoas de outras raças e " + 
				"credos, acredita que a sua raça é superior. Ele não pode" + 
				"se controlar em menosprezar outras raças em cada oportunidade. " + 
				"Um personagem assumindo a versão Menor tem" + 
				"Carisma -2 entre outras raças. A penalidade aumenta para " + 
				"-4 na Complicação Maior.", tipo, "Menor", "Maior");
	}
}
