package complicacao.savageworlds;

import core.Complicacao;

public class Ganancioso extends Complicacao {
	public Ganancioso(String tipo) {
		super("Ganancioso", "Seu herói avarento mede seu valor em tesouro. " + 
				"Se for uma Complicação Menor, ele argumenta " + 
				"amargamente sobre qualquer despojo adquirido " + 
				"durante o jogo. Se for uma Complicação Maior, " + 
				"luta por qualquer coisa que considerar desleal e " + 
				"pode até mesmo matar pela sua “parte justa”.", tipo, "Menor", "Maior");
	}
}
