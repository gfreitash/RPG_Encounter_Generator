package pericia.savageworlds;

import atributo.Vigor;
import core.Pericia;

public class Atletismo extends Pericia {
	public static final String nome = "Atletismo";
	public static final String desc = "Atletismo é um apanhado para uma quantidade de façanhas "
			+ "físicas abrangendo desde escalar, nadar até se mover "
			+ "efetivamente em um ambiente sem — ou com baixa gravidade. "
			+ "Atletismo deve ser usado no lugar de Agilidade em "
			+ "perseguições a pé e efetivamente substitui as perícias"
			+ " Escalar e Nadar.";
	
	public Atletismo() {
		super(new Vigor());
	}
	
	public Atletismo(int nivelDado) {
		super(new Vigor(), nivelDado);
	}
}
