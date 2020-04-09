package complicacao.interfacezero;

import core.Complicacao;

public class NanoInfeccao extends Complicacao {
	public static final String nome = "Nano-Infecção";
	public static final String desc = "Seu personagem foi infectado com um nano-vírus e acabou " + 
			"se ferrando no quesito mutação. Como uma Complicação " + 
			"Menor, escolha uma Perícia, o Dado Selvagem associado " + 
			"aquela perícia é um passo menor (normalmente um d4). " + 
			"Como uma Complicação Maior selecione um Atributo. O " + 
			"Dado Selvagem para aquele Atributo é um passo menor " + 
			"(normalmente um d4). " + 
			"Nano-Infecção pode ser adquirida múltiplàs vezes (se um " + 
			"personagem ficar totalmente ferrado por algum nano-vírus), " + 
			"embora os benefícios ganhos por assumir a Complicação " + 
			"ainda sejam limitados a um Maior e dois Menores";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public NanoInfeccao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NanoInfeccao(String tipo) {
		super(tipo);
	}
}
