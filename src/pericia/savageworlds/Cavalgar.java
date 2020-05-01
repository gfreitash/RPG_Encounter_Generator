package pericia.savageworlds;

import atributo.Agilidade;
import core.Pericia;

public class Cavalgar extends Pericia {
	public static final String nome = "Cavalgar";
	public static final String desc = "Cavalgar permite a um herói montar, controlar e " + 
			"conduzir qualquer animal comum em seu cenário. " + 
			"Jogadores devem notar que personagens montados " + 
			"usam a menor entre suas perícias de Cavalgar ou " + 
			"Lutar quando estiverem em combate montado";
	
	public Cavalgar() {
		super(nome, desc, new Agilidade());
	}
	
	public Cavalgar(int nivelDado) {
		super(nome, desc, new Agilidade(), nivelDado);
	}
}
