package pericia.savageworlds;

import core.Pericia;

public class Atletismo extends Pericia {
	private static String desc = "Atletismo é um apanhado para uma quantidade de façanhas "
			+ "físicas abrangendo desde escalar, nadar até se mover "
			+ "efetivamente em um ambiente sem — ou com baixa gravidade. "
			+ "Atletismo deve ser usado no lugar de Agilidade em "
			+ "perseguições a pé e efetivamente substitui as perícias"
			+ " Escalar e Nadar.";
	
	public Atletismo() {
		super("Atletismo", desc, new atributo.Vigor());
	}
	
	public Atletismo(int nivelDado) {
		super("Atletismo", desc, new atributo.Vigor(), nivelDado);
	}
}
