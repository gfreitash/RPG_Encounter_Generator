package vantagem.savageworlds;

import core.Progresso;
import requisito.RequisitoProgresso;

public class Prontidao extends VantagemAntecedente {
	public static final String nome = "Prontidão";
	public static final String desc = "Pouca coisa passa pelo seu herói. Ele é muito " + 
			"observador e perceptivo, e adiciona +2 a suas " + 
			"rolagens de Perceber para ouvir, ver ou sentir o " + 
			"mundo a seu redor de qualquer outra maneira.";
	
	public Prontidao() {
		super(nome, desc, new RequisitoProgresso(new Progresso(0)));
	}
	
	
}
