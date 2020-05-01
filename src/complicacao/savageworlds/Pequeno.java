package complicacao.savageworlds;

import core.Complicacao;

public class Pequeno extends Complicacao {
	public static final String nome = "Pequeno";
	public static final String desc = "Seu personagem é muito magro, muito baixo " + 
			"ou os dois em relação a sua raça em particular. " + 
			"Subtraia 1 da sua Resistência pela sua estatura " + 
			"reduzida.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Pequeno() {
		super(nome, desc, tipoPossivel);
	}
	
	public Pequeno(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
