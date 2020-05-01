package complicacao.savageworlds;

import core.Complicacao;

public class Curioso extends Complicacao {
	public static final String nome = "Curioso";
	public static final String desc = "A curiosidade matou o gato e também pode " + 
			"matar seu herói. Personagens curiosos são " + 
			"facilmente arrastados para qualquer aventura. Eles " + 
			"têm de verificar tudo e sempre querem saber o que " + 
			"há por trás de um mistério em potencial.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Curioso() {
		super(nome, desc, tipoPossivel);
	}
	
	public Curioso(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
