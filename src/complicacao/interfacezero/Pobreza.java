package complicacao.interfacezero;

import core.Complicacao;

public class Pobreza extends Complicacao {
	public Pobreza(String tipo) {
		super("Pobreza", "É dito que um tolo e seu dinheiro logo se " + 
				"separam. Seu herói é esse tolo. Ele começa com " + 
				"metade do dinheiro normal para o seu cenário " + 
				"e parece não conseguir poupar os recursos " + 
				"adquiridos do início do jogo. No geral, o jogador " + 
				"reduz a metade os seus recursos totais a cada " + 
				"semana de jogo.", tipo, "Maior");
	}
}
