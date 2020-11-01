package raca.interfacezero;

import core.NPC;

public class SimulacroSoldado extends Simulacro {
	public static final String NOME = "Soldado";
	public static final String DESCRICAO = """
			Construídos para salvar vidas humanas ao lutar as batalhas da humanidade por ela, simulacros de combate são o que há de melhor em máquinas de combate construídas para qualquer teatro de operações que eles possam ser alocados. As Nações Unidas, a UE, o Mandarinato Chinês e outras inúmeras potências mundiais mantêm um rígido controle sobre o uso e despacho de simulacros militares. Dito isso, alguns conseguem escorregar pelas rachaduras e encontrar meios de desaparecer do público.\s
			• Vida Útil (Maior): Simulacros soldados são projetados para viver apenas por quatro anos. Role um d4 para determinar quantos anos o seu personagem ainda tem.\s
			• Lutador: Simulacros soldados começam com um d6 em lutar.\s
			• Parrudo: Simulacros soldados começam com um d6 em Força.\s
			• Sólido: Simulacros soldados começam com um d6 em Vigor.\s
			• Estigma: Simus sofrem da Complicação Forasteiro quando agem fora de seu papel designado como soldados.""";

	public SimulacroSoldado() {
		super(NOME, DESCRICAO);
	}

	@Override
	public void aplicarEfeitos(NPC npc) {

	}
}
