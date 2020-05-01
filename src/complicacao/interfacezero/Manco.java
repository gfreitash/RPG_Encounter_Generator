package complicacao.interfacezero;

import core.Complicacao;

public class Manco extends Complicacao {
	public static final String nome = "Manco";
	public static final String desc = "Um ferimento do passado quase aleijou seu " + 
			"herói. Sua Movimentação básica é reduzida " + 
			"em 2 e ele rola apenas um d4 para correr. A " + 
			"Movimentação de um personagem nunca pode " + 
			"ser reduzida abaixo de 1." + "No mundo de Interface Zero 2.0, a medicina avançou ao " + 
			"ponto em que a Complicação listada " + 
			"acima pode ser removida com um simples procedimento " + 
			"médico. Por causa disso, qualquer personagem que assuma " + 
			"essas Complicações na criação de personagem, e então " + 
			"usa Aprimoramentos em jogo para removê-las, também " + 
			"deve gastar um Progresso. Aqueles que assumem essas " + 
			"Complicações na criação de personagem não podem anular " + 
			"os seus efeitos com Aprimoramentos durante a criação de " + 
			"personagem.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Manco() {
		super(nome, desc, tipoPossivel);
	}

	public Manco(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
