package complicacao.savageworlds;

import core.Complicacao;

public class Peculiaridade extends Complicacao {
	public Peculiaridade(String tipo) {
		super("Peculiaridade", "Seu herói tem alguma fraqueza menor, " + 
				"normalmente engraçada, mas que ocasionalmente " + 
				"lhe causa problemas. Um espadachim " + 
				"pode sempre tentar primeiro cortar suas iniciais " + 
				"em seus inimigos antes de atacar, um anão pode " + 
				"se vangloriar constantemente a respeito da sua " + 
				"cultura ou uma debutante esnobe pode não comer, " + 
				"beber ou socializar com as classes mais baixas.", tipo, "Menor");
	}
}
