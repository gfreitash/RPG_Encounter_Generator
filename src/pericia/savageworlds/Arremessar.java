package pericia.savageworlds;

import atributo.Agilidade;
import core.Pericia;

public class Arremessar extends Pericia {
	public static final String nome = "Arremessar";
	public static final String desc = "Arremessar governa todos os tipos de armas de " + 
			"arremesso, de granadas de mão a facas, machados e " + 
			"lanças. Arremessar funciona de maneira similar à " + 
			"perícia Atirar e utiliza os mesmos modificadores, " + 
			"incluindo aqueles a distância. A Cadência de Tiro " + 
			"de um ataque de arremesso é de 1 por mão. Deste " + 
			"modo, um personagem humano pode arremessar dois itens de uma só vez, um com cada mão, "
			+ "sofrendo as penalidades habituais de ação múltipla " + 
			"e mão inábil.";
	
	public Arremessar() {
		super(new Agilidade());
	}
	
	public Arremessar(int nivelDado) {
		super(new Agilidade(), nivelDado);
	}
}
