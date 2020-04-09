package complicacao.savageworlds;

import core.Complicacao;

public class Idoso extends Complicacao {
	public static final String nome = "Idoso";
	public static final String desc = "Seu herói está ficando velho, mas não " + 
			"está totalmente pronto para o asilo. Sua " + 
			"Movimentação é reduzida em 1 e sua Força " + 
			"e Vigor caem um tipo de dado até um " + 
			"mínimo de d4 e não podem ser aumentados " + 
			"posteriormente. " + 
			"Por outro lado, a sabedoria dos seus anos " + 
			"concede ao herói 5 pontos de perícia adicionais " + 
			"que podem ser usados em quaisquer perícias " + 
			"associadas à Astúcia.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Idoso() {
		
	}
	
	public Idoso(String tipo) {
		super(tipo);
	}
}
