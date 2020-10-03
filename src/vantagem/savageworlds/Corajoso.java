package vantagem.savageworlds;


import core.Atributo;
import core.Progresso;
import requisito.RequisitoAtributo;
import requisito.RequisitoProgresso;

public class Corajoso extends VantagemAntecedente {
	public static final String nome = "Corajoso";
	public static final String desc = "Aqueles com esta Vantagem aprenderam " + 
			"a dominar o seu medo. Ou talvez estejam tão " + 
			"calejados ou emocionalmente distantes que " + 
			"perderam sua reação normal de “lutar ou correr”. " + 
			"De qualquer maneira, seu herói adiciona +2 a " + 
			"testes de Medo. Caso o personagem esteja em " + 
			"um cenário que usa Coragem como uma Regra " + 
			"de Ambientação, o bônus é adicionado à perícia " + 
			"também.";
	
	public Corajoso() {
		super(nome, desc, new RequisitoProgresso(new Progresso(0)), new RequisitoAtributo(Atributo.ESPIRITO,6));
	}
}
