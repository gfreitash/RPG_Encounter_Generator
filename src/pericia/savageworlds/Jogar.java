package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Jogar extends Pericia {
	public static final String nome = "Jogar";
	public static final String desc = "Jogar é útil dos salões do Velho Oeste aos " + 
			"alojamentos da maioria dos exércitos. Aqui está " + 
			"uma maneira rápida de simular cerca de meia hora " + 
			"de jogatina sem ter de rolar para cada lance dos " + 
			"dados ou mão de cartas. " + 
			"Primeiro todos devem concordar com as apostas, " + 
			"como $10, 10 peças de ouro, etc. Agora todos no " + 
			"jogo têm de fazer uma rolagem de Jogar. O menor " + 
			"resultado paga ao maior resultado a diferença " + 
			"vezes a aposta. O segundo menor resultado paga ao " + 
			"segundo maior resultado a diferença vezes a aposta " + 
			"e assim por diante. Se sobrar alguém sozinho no " + 
			"meio, ele fica na média. " + 
			"Exemplo: Kali rola mais alto com um 10 e Yuri " + 
			"rola mais baixo com um 4. A diferença é 6, assim " + 
			"Yuri paga a Kali 6x a aposta de $10 ou $60. " + 
			"• Trapaceando: Um personagem " + 
			"trapaceando adiciona +2 a sua rolagem. " + 
			"O Mestre pode aumentar ou diminuir " + 
			"este modificador dependendo do jogo ou " + 
			"dos métodos específicos de trapaça. Se o " + 
			"personagem alguma vez rolar um 1 em seu " + 
			"dado de perícia (independente do seu Dado " + 
			"Selvagem), é apanhado. As consequências " + 
			"variam dependendo do cenário, mas " + 
			"normalmente são bastante severas.";
	
	public Jogar() {
		super(nome, desc, Atributo.ASTUCIA);
	}
	
	public Jogar(int nivelDado) {
		super(nome, desc, Atributo.ASTUCIA, nivelDado);
	}
}
