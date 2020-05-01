package complicacao.savageworlds;

import core.Complicacao;

public class Obeso extends Complicacao {
	public static final String nome = "Obeso";
	public static final String desc = "Pessoas particularmente grandes têm muita " + 
			"dificuldade em situações de perigo físico. " + 
			"Aqueles que suportam bem o seu próprio peso " + 
			"têm a Vantagem Musculoso. Aqueles que não " + 
			"lidam muito bem com ele são Obesos. Um " + 
			"personagem não pode ser Musculoso e Obeso " + 
			"simultaneamente. " + 
			"Um herói Obeso adiciona 1 a sua Resistência, " + 
			"mas sua Movimentação é decrescida em 1 e seu " + 
			"dado de corrida é um d4. Personagens obesos " + 
			"também podem ter dificuldade para achar " + 
			"armaduras ou roupas adequadas ao seu tamanho, " + 
			"caber em espaços apertados ou mesmo viajar em " + 
			"espaços confinados, como poltronas de aviões ou " + 
			"carros compactos.";
	public static final String tipoPossivel[] = {"Menor"};
	
	public Obeso() {
		super(nome, desc, tipoPossivel);
	}
	
	public Obeso(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
