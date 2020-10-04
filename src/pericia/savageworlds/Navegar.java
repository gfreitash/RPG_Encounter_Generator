package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Navegar extends Pericia {
	public static final String nome = "Navegar";
	public static final String desc = "Personagens com esta perícia podem conduzir " + 
			"qualquer embarcação ou navio comum em seus " + 
			"cenários e histórico de personagem. Geralmente " + 
			"também sabem como lidar com as tarefas mais " + 
			"comuns associadas a seus barcos (dar nós, " + 
			"encordar velas, etc.).";
	
	public Navegar() {
		super(nome, desc, Atributo.AGILIDADE);
	}
	
	public Navegar(int nivelDado) {
		super(nome, desc, Atributo.AGILIDADE, nivelDado);
	}
}
