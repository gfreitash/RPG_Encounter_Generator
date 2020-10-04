package pericia.savageworlds;


import core.Atributo;
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
		super(nome, desc, Atributo.VIGOR);
	}
	
	public Atletismo(int nivelDado) {
		super(nome, desc, Atributo.VIGOR, nivelDado);
	}
}
