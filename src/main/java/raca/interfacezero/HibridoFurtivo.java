package raca.interfacezero;

import core.NPC;
import core.Raca;

public class HibridoFurtivo extends Hibrido {
	public static final String NOME = "Furtivo";
	public static final String DESCRICAO = """
			Exemplos de Animais: Morcego, Rato, Gato\s
			• Reflexos Animais: Híbridos furtivos começam com um d6 em Furtividade e Escalar\s
			• Sentidos Aumentados: Híbridos Furtivos ganham +2 em testes de Perceber com um sentido a escolha do jogador.\s
			• Visão No Escuro: Híbridos furtivos ignoram os redutores para Penumbra e Baixa Visibilidade e podem ver em qualquer situação, exceto escuridão total.
			• Pequeno: Híbridos furtivos tendem a ter uma constituição frágil e tem -1 em Resistência.""";
	
	public HibridoFurtivo() {
		super(NOME, DESCRICAO);
	}


	@Override
	public void aplicarEfeitos(NPC npc) {

	}
}
