package complicacao.interfacezero;

import core.Complicacao;

public class Feio extends Complicacao {
	public Feio(String tipo) {
		super("Feio", "Infelizmente, este indivíduo acertou mais que " + 
				"alguns galhos de feiura na sua viagem de descida " + 
				"da árvore da vida. Seu Carisma é reduzido em 2 " + 
				"e geralmente é rejeitado por membros do sexo " + 
				"oposto.\n\n" + "No mundo de Interface Zero 2.0, a medicina avançou ao " + 
				"ponto em que a Complicação listada " + 
				"acima pode ser removida com um simples procedimento " + 
				"médico. Por causa disso, qualquer personagem que assuma " + 
				"essas Complicações na criação de personagem, e então " + 
				"usa Aprimoramentos em jogo para removê-las, também " + 
				"deve gastar um Progresso. Aqueles que assumem essas " + 
				"Complicações na criação de personagem não podem anular " + 
				"os seus efeitos com Aprimoramentos durante a criação de " + 
				"personagem.", tipo, "Menor");
	}
}
