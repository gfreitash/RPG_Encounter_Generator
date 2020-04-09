package pericia.savageworlds;

import atributo.Agilidade;
import core.Pericia;

public class Dirigir extends Pericia {
	public static final String nome = "Dirigir";
	public static final String desc = "Dirigir permite que seu herói conduza veículos " + 
			"e flutuadores terrestres comuns em seu cenário. " +
			"Dirigir também " + 
			"é frequentemente usado com as Regras de " + 
			"Perseguição";
	
	public Dirigir() {
		super(new Agilidade());
	}
	
	public Dirigir(int nivelDado) {
		super(new Agilidade(), nivelDado);
	}
}
