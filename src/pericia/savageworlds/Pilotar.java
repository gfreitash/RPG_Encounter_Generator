package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Pilotar extends Pericia {
	public static final String nome = "Pilotar";
	public static final String desc = "Pilotar permite a um personagem voar com " + 
			"aviões, helicópteros, mochilas a jato e qualquer " + 
			"outro dispositivo aéreo comum em seu cenário e " + 
			"histórico";
	
	public Pilotar() {
		super(nome, desc, Atributo.AGILIDADE);
	}
	
	public Pilotar(int nivelDado) {
		super(nome, desc, Atributo.AGILIDADE, nivelDado);
	}
}
