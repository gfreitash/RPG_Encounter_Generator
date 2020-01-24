package pericia.savageworlds;

import core.Pericia;

public class Cavalgar extends Pericia {
	private static String desc = "Cavalgar permite a um herói montar, controlar e " + 
			"conduzir qualquer animal comum em seu cenário. " + 
			"Jogadores devem notar que personagens montados " + 
			"usam a menor entre suas perícias de Cavalgar ou " + 
			"Lutar quando estiverem em combate montado";
	
	public Cavalgar() {
		super("Cavalgar", desc, new atributo.Agilidade());
	}
	
	public Cavalgar(int nivelDado) {
		super("Cavalgar", desc, new atributo.Agilidade(), nivelDado);
	}
}
