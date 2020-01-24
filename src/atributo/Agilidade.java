package atributo;

import core.Atributo;

public class Agilidade extends Atributo {
	public Agilidade(int nivelDado) {
		super("Agilidade", "AGILIDADE é a rapidez, velocidade e " + 
				"destreza do seu herói.", nivelDado);
	}
	
	public Agilidade() {
		super("Agilidade", "AGILIDADE é a rapidez, velocidade e " + 
				"destreza do seu herói.");
	}
}
