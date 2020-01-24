package complicacao.savageworlds;

import core.Complicacao;

public class MaSorte extends Complicacao {
	public MaSorte(String tipo) {
		super("Má Sorte", "Seu herói é um pouco menos sortudo que " + 
				"a maioria. Ele recebe um Bene a menos que o " + 
				"normal por sessão de jogo. Um personagem não " + 
				"pode ter Má Sorte e Sorte simultaneamente.", tipo, "Maior");
	}
}
