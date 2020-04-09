package complicacao.interfacezero;

import core.Complicacao;

public class UmaPernaSo extends Complicacao {
	public static final String nome = "Uma Perna Só";
	public static final String desc = "Com uma prótese, Uma Perna age exatamente " + 
			"como na Complicação Manco, reduzindo a " + 
			"Movimentação em 2 e as rolagens de corrida " + 
			"são feitas com um d4. Sem uma prótese, " + 
			"a Movimentação do Personagem é 2 e ele " + 
			"nunca pode correr. Ele também sofre -2 em " + 
			"Características que exijam mobilidade, como " + 
			"Escalar e Lutar. Um personagem com uma perna " + 
			"também sofre uma penalidade de -2 em sua " + 
			"perícia Nadar (e Movimentação)." + 
			"No mundo de Interface Zero 2.0, a medicina avançou ao " + 
			"ponto em que a Complicação listada " + 
			"acima pode ser removida com um simples procedimento " + 
			"médico. Por causa disso, qualquer personagem que assuma " + 
			"essas Complicações na criação de personagem, e então " + 
			"usa Aprimoramentos em jogo para removê-las, também " + 
			"deve gastar um Progresso. Aqueles que assumem essas " + 
			"Complicações na criação de personagem não podem anular " + 
			"os seus efeitos com Aprimoramentos durante a criação de " + 
			"personagem.";
	
	public UmaPernaSo(String tipo) {
		super(tipo, "Maior");
	}
}
