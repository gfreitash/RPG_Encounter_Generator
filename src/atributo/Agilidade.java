package atributo;

import core.Atributo;

public class Agilidade extends Atributo {
	public static final String nome = "Agilidade";
	public static final String desc = "AGILIDADE é a rapidez, velocidade e " + "destreza do seu herói.";

	public Agilidade() {
		super(nome, desc);
	}

	public Agilidade(int nivelDado) {
		super(nome, desc);
		setNivelDado(nivelDado);
	}

}
