package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Arrombar extends Pericia {
	public static final String nome = "Arrombar";
	public static final String desc = "Arrombar é a habilidade de passar por travas " + 
			"mecânicas e eletrônicas. Arrombar também " + 
			"é usado para desarmar as iscas e gatilhos de " + 
			"armadilhas, a menos que uma perícia mais " + 
			"relevante pareça mais apropriada para uma " + 
			"armadilha em particular.";
	
	public Arrombar() {
		super(nome, desc, Atributo.AGILIDADE);
	}
	
	public Arrombar(int nivelDado) {
		super(nome, desc, Atributo.AGILIDADE, nivelDado);
	}
}
