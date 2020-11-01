package raca.interfacezero;

import core.NPC;

public class HibridoFeroz extends Hibrido {
	public static final String NOME = "Feroz";
	public static final String DESCRICAO = """
			Exemplos de Animais: Ratel, Tigre, lobo
			• Irascível: Híbridos Ferozes sofrem uma penalidade de -2 em Testes de Vontade para resistir a Provocar. Em uma falha crítica, o híbrido ataca o provocador.
			 Sentidos Aguçados: +2 em testes de Notar com um sentido a escolha do jogador.
			• Parrudo: Híbridos Ferozes começam com um d6 em Força.
			• Arma Natural: Híbridos Ferozes nunca são considerados desarmados e causam For+d6 de dano quando fazem um ataque desarmado.""";

	public HibridoFeroz() {
		super(NOME, DESCRICAO);
	}


	@Override
	public void aplicarEfeitos(NPC npc) {

	}
}
