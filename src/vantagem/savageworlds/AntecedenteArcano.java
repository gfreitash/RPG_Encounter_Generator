package vantagem.savageworlds;

import core.Progresso;
import requisito.RequisitoProgresso;

public class AntecedenteArcano extends VantagemAntecedente {
	@SuppressWarnings("unused")
	private String especializacao;
	@SuppressWarnings("unused")
	private String nome;
	
	public static final String desc = "Esta é a Vantagem que o seu personagem precisa " + 
			"comprar para ter qualquer tipo de habilidade " + 
			"mágica, psíquica ou sobrenatural.";
	
	public AntecedenteArcano(String especializacao) {
		super("Antecedente Arcano (" + especializacao + ")", desc,new RequisitoProgresso(new Progresso(0)));
		nome = "Antecedente Arcano (" + especializacao + ")";
		this.especializacao = especializacao;
	}
}
