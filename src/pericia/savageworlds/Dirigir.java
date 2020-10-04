package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Dirigir extends Pericia {
	public static final String nome = "Dirigir";
	public static final String desc = "Dirigir permite que seu herói conduza veículos " + 
			"e flutuadores terrestres comuns em seu cenário. " +
			"Dirigir também " + 
			"é frequentemente usado com as Regras de " + 
			"Perseguição";
	
	public Dirigir() {
		super(nome, desc, Atributo.AGILIDADE);
	}
	
	public Dirigir(int nivelDado) {
		super(nome, desc, Atributo.AGILIDADE, nivelDado);
	}
}
