package raca.interfacezero;

import core.Raca;

public class SimulacroLuxo extends Raca implements Simulacro {
	private static final String nome = "Simulacro de Luxo";
	private static final String desc = "Simulacros de luxo são o segundo tipo mais comum de, " + 
			"atrás apenas dos modelos trabalhadores, e vem em uma " + 
			"impressionante variedade de formas humanóides, tipos e " + 
			"aparências étnicas. Qualquer coisa desde animais empalhados " + 
			"do tamanho de uma criança, artistas, até modelos " + 
			"de prostituição avançados. " + 
			"\n• Atraente: Simulacros de luxo são criados para agradar" + 
			"aos olhos. Eles começam com +2 no Carisma. " + 
			"\n• Vida Útil, Menor: Simulacros de luxo são projetados " + 
			"para viver apenas por dez anos. Role um d6+4 para " + 
			"determinar quantos anos o seu personagem ainda tem. " + 
			"\n• Dócil: Simulacros de luxo não são criaturas muito agressivas. " + 
			"Eles tendem a ficar um pouco enjoados com " + 
			"sangue e preferem evitar conflitos, a menos que não " + 
			"haja outra opção. Eles sofrem da Complicação Pacifista " + 
			"Menor. " + 
			"\n• Inteligente: Simulacros de luxo começam com um d6 " + 
			"em Astúcia. " + 
			"\n• Protocolo Primário: Simulacros de luxo começam com " + 
			"um d6 de graça em uma perícia, representando o seu " + 
			"sistema operacional central. " + 
			"\n• Estigma: Simus sofrem da Complicação Forasteiro " + 
			"quando agem fora de seu papel designado como animadores " + 
			"e servos.";
	
	public SimulacroLuxo() {
		super(nome, desc);
	}
	@Override
	protected void setModificadores() {
		// TODO Auto-generated method stub

	}

}
