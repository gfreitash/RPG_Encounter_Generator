package complicacao.savageworlds;

import core.Complicacao;

public class SemNocao extends Complicacao {
	public static final String nome = "Sem Noção";
	public static final String desc = "Seu herói não é tão consciente de seu mundo " + 
			"quanto a maioria das pessoas. Ele sofre -2 em " + 
			"rolagens de Conhecimento Geral.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public SemNocao() {
		super(nome, desc, tipoPossivel);
	}
	
	public SemNocao(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
