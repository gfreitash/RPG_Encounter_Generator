package pericia.savageworlds;

import core.Pericia;

public class Navegar extends Pericia {
	private static String desc = "Personagens com esta perícia podem conduzir " + 
			"qualquer embarcação ou navio comum em seus " + 
			"cenários e histórico de personagem. Geralmente " + 
			"também sabem como lidar com as tarefas mais " + 
			"comuns associadas a seus barcos (dar nós, " + 
			"encordar velas, etc.).";
	
	public Navegar() {
		super("Navegar", desc, new atributo.Agilidade());
	}
	
	public Navegar(int nivelDado) {
		super("Navegar", desc, new atributo.Agilidade(), nivelDado);
	}
}
