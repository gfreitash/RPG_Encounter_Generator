package raca.interfacezero;

import core.Raca;

public class HibridoFeroz extends Raca implements Hibrido {
	private static final String nome = "Híbrido Feroz";
	private static final String desc = "Exemplos de Animais: Ratel, Tigre, lobo"
			+ "\n• Irascível: Híbridos Ferozes sofrem uma penalidade de -2 em "
			+ "Testes de Vontade para resistir a Provocar. Em uma falha crítica, "
			+ "o híbrido ataca o provocador."
			+ "\n Sentidos Aguçados: +2 em testes de Notar com um sentido a "
			+ "escolha do jogador."
			+ "\n• Parrudo: Híbridos Ferozes começam com um d6 em Força."
			+ "\n• Arma Natural: Híbridos Ferozes nunca são considerados desarmados "
			+ "e causam For+d6 de dano quando fazem um ataque desarmado.";
	
	public HibridoFeroz() {
		super(nome, desc);
	}
	

}
