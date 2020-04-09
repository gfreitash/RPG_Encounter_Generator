package vantagem.savageworlds;

import atributo.Forca;
import atributo.Vigor;
import core.Progresso;
import requisito.RequisitoAtributo;
import requisito.RequisitoProgresso;

public class Musculoso extends VantagemAntecedente {
	public static final String nome = "Musculoso";
	public static final String desc = "O seu lutador é muito grande ou talvez apenas " + 
			"esteja em boa forma. Sua massa resiste a dano " + 
			"melhor que a da maioria e adiciona +1 a sua " + 
			"Resistência. Além disso, o personagem pode " + 
			"carregar mais do que o proporcional a sua Força: " + 
			"quatro vezes a sua Força em quilos sem penalidade " + 
			"ao invés do normal de 2,5 vezes a sua Força.";
	
	public Musculoso() {
		super(new RequisitoProgresso(new Progresso(0)), new RequisitoAtributo(new Forca(6)), 
				new RequisitoAtributo(new Vigor(6)));
	}
}
