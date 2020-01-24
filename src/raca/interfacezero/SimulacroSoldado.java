package raca.interfacezero;

import core.Raca;

public class SimulacroSoldado extends Raca implements Simulacro {
	private static final String nome = "Simulacro Soldado";
	private static final String desc = "Construídos para salvar vidas humanas ao lutar as batalhas " + 
			"da humanidade por ela, simulacros de combate são o " + 
			"que há de melhor em máquinas de combate construídas " + 
			"para qualquer teatro de operações que eles possam ser " + 
			"alocados. As Nações Unidas, a UE, o Mandarinato Chinês e " + 
			"outras inúmeras potências mundiais mantêm " + 
			"um rígido controle sobre o uso e despacho " + 
			"de simulacros militares. Dito isso, alguns " + 
			"conseguem escorregar pelas rachaduras e " + 
			"encontrar meios de desaparecer do público. " + 
			"\n• Vida Útil (Maior): Simulacros soldados " + 
			"são projetados para viver apenas por quatro anos. Role um d4 para " + 
			"determinar quantos anos o seu personagem ainda tem. " + 
			"\n• Lutador: Simulacros soldados começam com um d6 em lutar. " + 
			"\n• Parrudo: Simulacros soldados começam com um d6 em Força. " + 
			"\n• Sólido: Simulacros soldados começam com um d6 em Vigor. " + 
			"\n• Estigma: Simus sofrem da Complicação " + 
			"Forasteiro quando agem fora de seu papel designado como soldados.";
	
	public SimulacroSoldado() {
		super(nome, desc);
	}
	@Override
	protected void setModificadores() {
		// TODO Auto-generated method stub

	}

}
