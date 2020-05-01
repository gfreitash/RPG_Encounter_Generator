package raca.interfacezero;

import core.Raca;

public class HibridoFurtivo extends Raca implements Hibrido {
	private static final String nome = "Híbrido Furtivo";
	private static final String desc = "Exemplos de Animais: Morcego, Rato, Gato " + 
			"\n• Reflexos Animais: Híbridos furtivos começam com um " + 
			"d6 em Furtividade e Escalar " + 
			"\n• Sentidos Aumentados: Híbridos Furtivos ganham +2 " + 
			"em testes de Perceber com um sentido a escolha do " + 
			"jogador. " + 
			"\n• Visão No Escuro: Híbridos furtivos ignoram os redutores " + 
			"para Penumbra e Baixa Visibilidade e podem ver em " + 
			"qualquer situação, exceto escuridão total." + 
			"\n• Pequeno: Híbridos furtivos tendem a ter uma constituição " + 
			"frágil e tem -1 em Resistência.";
	
	public HibridoFurtivo() {
		super(nome, desc);
	}


}
