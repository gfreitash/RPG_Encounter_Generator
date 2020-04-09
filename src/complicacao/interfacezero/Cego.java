package complicacao.interfacezero;

import core.Complicacao;

public class Cego extends Complicacao {
	public static final String nome = "Cego";
	public static final String desc = "O indivíduo é completamente cego. Ele sofre " +
			"-6 em todas as tarefas físicas dependentes da visão " + 
			"(ou seja, praticamente tudo) e -2 na maior parte das " + 
			"tarefas sociais, pois não pode “ler” quem interage " + 
			"com ele tão bem como os outros. " + 
			"Por outro lado, personagens Cegos ganham uma " + 
			"Vantagem gratuita a sua escolha para compensar " + 
			"esta Complicação particularmente difícil.\n\n" +
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
	public Cego(String tipo) {
		super(tipo, "Maior");
	}
}
