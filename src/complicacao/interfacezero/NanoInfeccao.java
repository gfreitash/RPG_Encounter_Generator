package complicacao.interfacezero;

import core.Complicacao;

public class NanoInfeccao extends Complicacao {
	public NanoInfeccao(String tipo) {
		super("Nano-Infecção", "Seu personagem foi infectado com um nano-vírus e acabou " + 
				"se ferrando no quesito mutação. Como uma Complicação " + 
				"Menor, escolha uma Perícia, o Dado Selvagem associado " + 
				"aquela perícia é um passo menor (normalmente um d4). " + 
				"Como uma Complicação Maior selecione um Atributo. O " + 
				"Dado Selvagem para aquele Atributo é um passo menor " + 
				"(normalmente um d4). " + 
				"Nano-Infecção pode ser adquirida múltiplàs vezes (se um " + 
				"personagem ficar totalmente ferrado por algum nano-vírus), " + 
				"embora os benefícios ganhos por assumir a Complicação " + 
				"ainda sejam limitados a um Maior e dois Menores", tipo, "Menor", "Maior");
	}
}
