package complicacao.savageworlds;

import core.Complicacao;

public class MaSorte extends Complicacao {
	public static final String nome = "Má Sorte";
	public static final String desc = "Seu herói é um pouco menos sortudo que " + 
			"a maioria. Ele recebe um Bene a menos que o " + 
			"normal por sessão de jogo. Um personagem não " + 
			"pode ter Má Sorte e Sorte simultaneamente.";
	
	public MaSorte(String tipo) {
		super(tipo, "Maior");
	}
}
