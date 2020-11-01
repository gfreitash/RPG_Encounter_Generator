package raca.interfacezero;

import core.NPC;

public class SimulacroLuxo extends Simulacro {
	public static final String NOME = "de Luxo";
	public static final String DESCRICAO = """
			Simulacros de luxo são o segundo tipo mais comum de, atrás apenas dos modelos trabalhadores, e vem em uma impressionante variedade de formas humanóides, tipos e aparências étnicas. Qualquer coisa desde animais empalhados do tamanho de uma criança, artistas, até modelos de prostituição avançados.\s
			• Atraente: Simulacros de luxo são criados para agradaraos olhos. Eles começam com +2 no Carisma.\s
			• Vida Útil, Menor: Simulacros de luxo são projetados para viver apenas por dez anos. Role um d6+4 para determinar quantos anos o seu personagem ainda tem.\s
			• Dócil: Simulacros de luxo não são criaturas muito agressivas. Eles tendem a ficar um pouco enjoados com sangue e preferem evitar conflitos, a menos que não haja outra opção. Eles sofrem da Complicação Pacifista Menor.\s
			• Inteligente: Simulacros de luxo começam com um d6 em Astúcia.\s
			• Protocolo Primário: Simulacros de luxo começam com um d6 de graça em uma perícia, representando o seu sistema operacional central.\s
			• Estigma: Simus sofrem da Complicação Forasteiro quando agem fora de seu papel designado como animadores e servos.""";

	public SimulacroLuxo() {
		super(NOME, DESCRICAO);
	}

	@Override
	public void aplicarEfeitos(NPC npc) {

	}
}
