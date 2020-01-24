package complicacao.savageworlds;

import core.Complicacao;

public class SemNocao extends Complicacao {
	public SemNocao(String tipo) {
		super("Sem Noção", "Seu herói não é tão consciente de seu mundo " + 
				"quanto a maioria das pessoas. Ele sofre -2 em " + 
				"rolagens de Conhecimento Geral.", tipo, "Maior");
	}
}
