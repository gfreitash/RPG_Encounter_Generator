package complicacao.savageworlds;

import core.Complicacao;

public class Arrogante extends Complicacao {
	public static final String nome = "Arrogante";
	public static final String desc = "Seu herói não pensa ser o melhor – ele sabe " + 
			"que é. Seja no que for – esgrima, kung fu, corrida " + 
			"– poucos se comparam às suas habilidades e ele " + 
			"ostenta isso a cada oportunidade que tem. " + 
			"Só vencer não é o bastante para o seu herói. Ele " + 
			"precisa dominar completamente o seu oponente. " + 
			"Sempre que houver sequer uma sombra de dúvida " + 
			"a respeito de quem é o melhor, deve humilhar " + 
			"seu oponente e provar poder alcançar a vitória a " +  
			"qualquer momento desejado. É o tipo de homem " + 
			"que desarma um oponente em um duelo só para " + 
			"poder pegar a sua espada e devolvê-la com um " + 
			"sorriso desdenhoso. " + 
			"Heróis arrogantes sempre procuram pelo " + 
			"“chefe” em batalha, atacando lacaios menores " + 
			"apenas se ficarem em seu caminho.";
	
	public Arrogante(String tipo) {
		super(tipo, "Maior");
	}
}
