package pericia.savageworlds;

import core.Pericia;

public class Rastrear extends Pericia {
	private static String desc = "Rastrear permite que um personagem siga os " + 
			"rastros de um ou mais indivíduos em qualquer tipo " + 
			"de terreno. Cada rolagem geralmente cobre seguir " + 
			"os rastros por cerca de um quilômetro e meio, mas " + 
			"o Mestre pode ajustar isso dramaticamente para " + 
			"escalas de busca mais específicas ou menores.";
	
	public Rastrear() {
		super("Rastrar", desc, new atributo.Astucia());
	}
	
	public Rastrear(int nivelDado) {
		super("Rastrar", desc, new atributo.Astucia(), nivelDado);
	}
}
