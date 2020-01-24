package pericia.savageworlds;

import core.Pericia;

public class Dirigir extends Pericia {
	private static String desc = "Dirigir permite que seu herói conduza veículos " + 
			"e flutuadores terrestres comuns em seu cenário. " +
			"Dirigir também " + 
			"é frequentemente usado com as Regras de " + 
			"Perseguição";
	
	public Dirigir() {
		super("Dirigir", desc, new atributo.Agilidade());
	}
	
	public Dirigir(int nivelDado) {
		super("Dirigir", desc, new atributo.Agilidade(), nivelDado);
	}
}
