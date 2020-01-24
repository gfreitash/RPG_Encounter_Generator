package pericia.savageworlds;

import core.Pericia;

public class Intimidar extends Pericia {
	private static String desc;
	
	public Intimidar() {
		super("Intimidar", desc, new atributo.Espirito());
	}
	
	public Intimidar(int nivelDado) {
		super("Intimidar", desc, new atributo.Espirito(), nivelDado);
	}
}
