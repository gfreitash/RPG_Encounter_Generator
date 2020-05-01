package complicacao.savageworlds;

import core.Complicacao;

public class Ganancioso extends Complicacao {
	public static final String nome = "Ganancioso";
	public static final String desc = "Seu herói avarento mede seu valor em tesouro. " + 
			"Se for uma Complicação Menor, ele argumenta " + 
			"amargamente sobre qualquer despojo adquirido " + 
			"durante o jogo. Se for uma Complicação Maior, " + 
			"luta por qualquer coisa que considerar desleal e " + 
			"pode até mesmo matar pela sua “parte justa”.";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public Ganancioso() {
		super(nome, desc, tipoPossivel);
	}
	
	public Ganancioso(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
