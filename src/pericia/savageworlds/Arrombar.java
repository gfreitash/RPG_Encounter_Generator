package pericia.savageworlds;

import core.Pericia;

public class Arrombar extends Pericia {
	private static String desc = "Arrombar é a habilidade de passar por travas " + 
			"mecânicas e eletrônicas. Arrombar também " + 
			"é usado para desarmar as iscas e gatilhos de " + 
			"armadilhas, a menos que uma perícia mais " + 
			"relevante pareça mais apropriada para uma " + 
			"armadilha em particular.";
	
	public Arrombar() {
		super("Arrombar", desc, new atributo.Agilidade());
	}
	
	public Arrombar(int nivelDado) {
		super("Arrombar", desc, new atributo.Agilidade(), nivelDado);
	}
}
