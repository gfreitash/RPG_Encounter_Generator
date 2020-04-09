package complicacao.savageworlds;

import core.Complicacao;

public class Voto extends Complicacao {
	public static final String nome = "Voto";
	public static final String desc = "O personagem possui um voto de algum tipo. " + 
			"Se é uma Complicação Maior ou Menor depende " + 
			"do Voto em si. Alguns podem ter votos para " + 
			"com ordens ou causas específicas, para com " + 
			"o juramento Hipocrático, livrar o mundo do " + 
			"mal e assim por diante. O risco em cumprir o " + 
			"Voto e quão ocasionalmente isso pode ocorrer " + 
			"determinam o nível da Complicação. Qualquer " + 
			"que seja o Voto, ele só será uma Complicação se " + 
			"realmente aparecer em jogo de tempos em tempos " + 
			"e causar ao personagem algum desconforto.";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public Voto() {
	}
	
	public Voto(String tipo) {
		super(tipo);
	}
}
