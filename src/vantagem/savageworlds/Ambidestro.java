package vantagem.savageworlds;

import core.Progresso;
import requisito.RequisitoProgresso;

public class Ambidestro extends VantagemAntecedente {
	public static final String nome = "Ambidestro";
	public static final String desc = "Seu herói é hábil tanto com a sua mão " + 
			"esquerda quanto com a sua direita. Personagens " + 
			"normalmente sofrem uma penalidade de -2 ao " + 
			"executar tarefas físicas utilizando a mão inábil " + 
			"(presume-se que personagens sejam destros). Com " + 
			"esta Vantagem, seu herói ignora a penalidade de -2 " + 
			"por usar sua mão inábil";
	
	public Ambidestro() {
		super(nome, desc, new RequisitoProgresso(new Progresso(0)));
	}
}
