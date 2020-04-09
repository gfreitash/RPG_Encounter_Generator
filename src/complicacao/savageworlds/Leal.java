package complicacao.savageworlds;

import core.Complicacao;

public class Leal extends Complicacao {
	public static final String nome = "Leal";
	public static final String desc = "Seu personagem pode não ser um herói, " + 
			"mas daria a sua vida pelos seus amigos. Esse " + 
			"personagem nunca pode deixar um homem para " + 
			"trás se houver qualquer chance dele poder ajudar.";
	public static final String tipoPossivel[] = {"Menor"};
	
	public Leal() {
		
	}
	
	public Leal(String tipo) {
		super(tipo);
	}
}
