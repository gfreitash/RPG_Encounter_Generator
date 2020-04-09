package complicacao.savageworlds;

import core.Complicacao;

public class Leal extends Complicacao {
	public static String nome = "Leal";
	public static String desc = "Seu personagem pode não ser um herói, " + 
			"mas daria a sua vida pelos seus amigos. Esse " + 
			"personagem nunca pode deixar um homem para " + 
			"trás se houver qualquer chance dele poder ajudar.";
	
	public Leal(String tipo) {
		super(tipo, "Menor");
	}
}
