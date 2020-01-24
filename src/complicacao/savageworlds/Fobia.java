package complicacao.savageworlds;

import core.Complicacao;

public class Fobia extends Complicacao {
	public Fobia(String tipo) {
		super("Fobia", "Fobias são medos esmagadores e irracionais " + 
				"que permanecem com o herói pelo resto da sua " + 
				"vida. Sempre que um personagem estiver na " + 
				"presença de sua fobia, subtraia 2 de todos os testes " + 
				"de Característica no caso de uma Complicação " + 
				"Menor e 4 se o medo for uma Fobia Maior. " + 
				"Fobias não devem ser muito óbvias – todos " + 
				"devem temer vampiros, por exemplo. Sendo " + 
				"assim, isso não é uma fobia – é senso comum. " + 
				"Ao invés disso, a fobia geralmente se concentra " + 
				"em algum elemento aleatório focado pela " + 
				"mente durante qualquer que seja o encontro " + 
				"causador deste terror. Lembre, fobias são medos " + 
				"irracionais.", tipo, "Menor", "Maior");
	}
}
