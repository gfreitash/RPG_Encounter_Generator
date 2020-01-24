package complicacao.savageworlds;

import core.Complicacao;

public class DesejoMorrer extends Complicacao {
	public DesejoMorrer(String tipo) {
		super("Desejo de Morrer", "Ter um desejo de morrer não significa que " + 
				"seu herói seja um suicida – mas ele quer morrer " + 
				"depois de completar algum objetivo importante. " + 
				"Talvez queira vingança pelo assassinato de sua " + 
				"família ou talvez esteja morrendo de alguma " + 
				"doença e queira partir em um lampejo de glória. " + 
				"Ele não vai jogar sua vida fora por qualquer " + 
				"razão, mas quando houver uma chance de " + 
				"completar o seu objetivo, fará qualquer coisa – e " + 
				"aceitará qualquer risco – para alcançá-lo. " + 
				"Essa normalmente é uma Complicação menor, " + 
				"a menos que o objetivo seja relativamente fácil " + 
				"de ser alcançado (muito raro).", tipo, "Menor", "Maior");
	}
}
