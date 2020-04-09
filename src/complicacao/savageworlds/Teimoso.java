package complicacao.savageworlds;

import core.Complicacao;

public class Teimoso extends Complicacao {
	public static final String nome = "Teimoso";
	public static final String desc = "Este indivíduo sempre quer as coisas do " + 
			"seu jeito e nunca admite estar errado. Mesmo " + 
			"quando é dolorosamente óbvio que cometeu " + 
			"um erro, tenta justificá-lo com meias-verdades e " + 
			"racionalizações.";
	
	public Teimoso(String tipo) {
		super(tipo, "Maior");
	}
}
