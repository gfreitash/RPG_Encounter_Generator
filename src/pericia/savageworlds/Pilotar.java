package pericia.savageworlds;

import core.Pericia;

public class Pilotar extends Pericia {
	private static String desc = "Pilotar permite a um personagem voar com " + 
			"aviões, helicópteros, mochilas a jato e qualquer " + 
			"outro dispositivo aéreo comum em seu cenário e " + 
			"histórico";
	
	public Pilotar() {
		super("Pilotar", desc, new atributo.Agilidade());
	}
	
	public Pilotar(int nivelDado) {
		super("Pilotar", desc, new atributo.Agilidade(), nivelDado);
	}
}
