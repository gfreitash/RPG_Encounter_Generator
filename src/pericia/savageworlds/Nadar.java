package pericia.savageworlds;

import core.Pericia;

public class Nadar extends Pericia {
	private static String desc = "Nadar determina se um personagem flutua ou " + 
			"afunda na água, bem como quão rápido ele se move " + 
			"dentro dela. A Movimentação de um personagem " + 
			"é igual à metade da sua perícia Natação em quadros " + 
			"por turno em águas normais (arredondado para " + 
			"cima). Águas agitadas contam como terreno " + 
			"acidentado reduzindo essa taxa à metade. " + 
			"Personagens não podem “correr” enquanto nadam " + 
			"para ter movimento extra.";
	
	public Nadar() {
		super("Nadar", desc, new atributo.Agilidade());
	}
	
	public Nadar(int nivelDado) {
		super("Nadar", desc, new atributo.Agilidade(), nivelDado);
	}
}
