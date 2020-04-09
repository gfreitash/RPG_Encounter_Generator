package complicacao.savageworlds;

import core.Complicacao;

public class BocaGrande extends Complicacao {
	public static final String nome = "Boca Grande";
	public static final String desc = "Todos sabem que deve-se tomar cuidado com o " + 
			"que se diz, não é mesmo? Bem, o seu personagem " + 
			"não sabe. " + 
			"Seu personagem não consegue guardar " + 
			"muito bem um segredo. Ele revela os planos " + 
			"e deixa escapar as coisas mais bem guardadas " + 
			"entre amigos, geralmente nos piores momentos " + 
			"possíveis.";
	public static final String tipoPossivel[] = {"Menor"};
	
	public BocaGrande() {
		super();
	}
	
	public BocaGrande(String tipo) {
		super(tipo);
	}
}
