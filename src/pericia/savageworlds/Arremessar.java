package pericia.savageworlds;

import core.Pericia;

public class Arremessar extends Pericia {
	private static String desc = "Arremessar governa todos os tipos de armas de " + 
			"arremesso, de granadas de mão a facas, machados e " + 
			"lanças. Arremessar funciona de maneira similar à " + 
			"perícia Atirar e utiliza os mesmos modificadores, " + 
			"incluindo aqueles a distância. A Cadência de Tiro " + 
			"de um ataque de arremesso é de 1 por mão. Deste " + 
			"modo, um personagem humano pode arremessar dois itens de uma só vez, um com cada mão, "
			+ "sofrendo as penalidades habituais de ação múltipla " + 
			"e mão inábil.";
	
	public Arremessar() {
		super("Arremessar", desc , new atributo.Agilidade());
	}
	
	public Arremessar(int nivelDado) {
		super("Arremessar", desc, new atributo.Agilidade(), nivelDado);
	}
}
