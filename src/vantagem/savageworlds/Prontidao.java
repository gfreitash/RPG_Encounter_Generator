package vantagem.savageworlds;

import core.Progresso;
import core.Requisito;

public class Prontidao extends VantagemAntecedente {
	private static final String nome = "Prontidão";
	private static final String desc = "Pouca coisa passa pelo seu herói. Ele é muito " + 
			"observador e perceptivo, e adiciona +2 a suas " + 
			"rolagens de Perceber para ouvir, ver ou sentir o " + 
			"mundo a seu redor de qualquer outra maneira.";
	
	public Prontidao() {
		super(nome, desc, new Requisito(new Progresso(0)));
	}
	
	
}
