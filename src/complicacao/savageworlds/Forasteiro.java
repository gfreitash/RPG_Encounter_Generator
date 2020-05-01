package complicacao.savageworlds;

import core.Complicacao;

public class Forasteiro extends Complicacao {
	public static final String nome = "Forasteiro";
	public static final String desc = "Em uma sociedade formada por apenas alguns " + 
			"tipos de pessoa, o seu herói não é uma delas. " + 
			"Um índio em uma cidade do Velho Oeste, um " + 
			"alienígena em um jogo de ficção científica de " + 
			"fuzileiros humanos ou um meio-orc em um grupo " + 
			"de elfos, anões e humanos são todos exemplos de " + 
			"Forasteiros. Habitantes locais são suscetíveis a " + 
			"aumentar os preços para o Forasteiro, ignorar " + 
			"seus pedidos de socorro e geralmente tratam-no " + 
			"como se fosse de uma classe mais baixa que a do " + 
			"resto de sua sociedade. " + 
			"Além dos efeitos de interpretação acima, o " + 
			"Carisma do seu herói sofre um modificador de " + 
			"-2 em relação a todos menos o seu próprio povo.";
	public static final String tipoPossivel[] = {"Menor"};
	
	public Forasteiro() {
		super(nome, desc, tipoPossivel);
	}
	
	public Forasteiro(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
