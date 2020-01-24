package pericia.savageworlds;

import core.Pericia;

public class Lutar extends Pericia {
	private static String desc = "Lutar cobre todos os ataques corpo a corpo, " + 
			"sejam eles com os punhos, machados, espadas laser " + 
			"ou artes marciais. A Dificuldade para atingir um " + 
			"oponente é o seu Aparar (2 mais a metade do seu " + 
			"Lutar).";
	
	public Lutar() {
		super("Lutar", desc, new atributo.Agilidade());
	}
	
	public Lutar(int nivelDado) {
		super("Lutar", desc, new atributo.Agilidade(), nivelDado);
	}
}
