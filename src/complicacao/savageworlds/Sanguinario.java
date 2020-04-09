package complicacao.savageworlds;

import core.Complicacao;

public class Sanguinario extends Complicacao {
	public static final String nome = "Sanguinário";
	public static final String desc = "Seu herói nunca faz prisioneiros, exceto sob " + 
			"a supervisão direta de um superior. Isso pode " + 
			"causar grandes problemas em uma campanha " + 
			"militar, a menos que seus superiores tolerem esse " + 
			"tipo de coisa. Seu herói sofre -4 no seu Carisma " + 
			"somente se seus hábitos cruéis forem conhecidos";
	
	public Sanguinario(String tipo) {
		super(tipo, "Maior");
	}
}
