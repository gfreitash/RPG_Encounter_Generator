package vantagem.savageworlds;

import atributo.Espirito;
import core.Progresso;
import core.Requisito;

public class Corajoso extends VantagemAntecedente {
	private static final String nome = "Corajoso";
	private static final String desc = "Aqueles com esta Vantagem aprenderam " + 
			"a dominar o seu medo. Ou talvez estejam tão " + 
			"calejados ou emocionalmente distantes que " + 
			"perderam sua reação normal de “lutar ou correr”. " + 
			"De qualquer maneira, seu herói adiciona +2 a " + 
			"testes de Medo. Caso o personagem esteja em " + 
			"um cenário que usa Coragem como uma Regra " + 
			"de Ambientação, o bônus é adicionado à perícia " + 
			"também.";
	
	public Corajoso() {
		super(nome, desc, new Requisito(new Progresso(0)), new Requisito(new Espirito(6)));
	}
}
