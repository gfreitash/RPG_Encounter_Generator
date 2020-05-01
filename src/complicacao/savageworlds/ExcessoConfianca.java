package complicacao.savageworlds;

import core.Complicacao;

public class ExcessoConfianca extends Complicacao {
	public static final String nome = "Excesso de Confiança";
	public static final String desc = "Não existe nada que seu herói não possa " + 
			"derrotar. Pelo menos é isso que pensa. Ele acredita " + 
			"poder fazer quase tudo e nunca quer fugir de um " + 
			"desafio. O herói não é um suicida, mas certamente " + 
			"faz mais do que dita o bom senso.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public ExcessoConfianca() {
		super(nome, desc, tipoPossivel);
	}
	
	public ExcessoConfianca(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
