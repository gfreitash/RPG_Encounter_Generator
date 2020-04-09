package complicacao.savageworlds;

import core.Complicacao;

public class Pequeno extends Complicacao {
	public static final String nome = "Pequeno";
	public static final String desc = "Seu personagem é muito magro, muito baixo " + 
			"ou os dois em relação a sua raça em particular. " + 
			"Subtraia 1 da sua Resistência pela sua estatura " + 
			"reduzida.";
	
	public Pequeno(String tipo) {
		super(tipo, "Maior");
	}
}
