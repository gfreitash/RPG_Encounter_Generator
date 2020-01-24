package vantagem.savageworlds;

import atributo.Agilidade;
import core.Progresso;
import core.Requisito;

public class Rapido extends VantagemAntecedente {
	private static final String nome = "Rápido";
	private static final String desc = "Personagens rápidos possuem reflexos velozes " + 
			"como um raio e uma cabeça fria. Sempre que " + 
			"você sacar um 5 ou menos em combate, você " + 
			"pode descartar e sacar de novo até pegar uma " + 
			"carta superior a 5. " + 
			"Personagens com ambas as Vantagens " + 
			"Equilibrado e Rápido sacam suas cartas adicionais " + 
			"e pegam a melhor. Se esta carta for um Cinco ou " + 
			"menor, a Vantagem Rápido pode ser usada para " + 
			"sacar uma substituta até sair um Seis ou maior.";
	
	public Rapido() {
		super(nome, desc, new Requisito(new Progresso(0)), new Requisito(new Agilidade(8)));
	}
}
