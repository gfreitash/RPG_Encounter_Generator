package complicacao.savageworlds;

import core.Complicacao;

public class Procurado extends Complicacao {
	public static final String nome = "Procurado";
	public static final String desc = "Seu herói cometeu algum crime no passado e " + 
			"será preso se for descoberto pelas autoridades. " + 
			"Isso pressupõe que o cenário possui leis e oficiais " + 
			"de polícia para impô-las. " + 
			"O nível da Complicação depende da seriedade " + 
			"do crime. Um herói com várias multas de estacionamento " + 
			"não pagas (em um jogo em que " + 
			"ele pode ter de dirigir ocasionalmente) possui " + 
			"uma Complicação Menor, assim como alguém " + 
			"procurado por um crime mais grave longe da " + 
			"área principal da campanha. Ser acusado de " + 
			"assassinato é uma Complicação Maior em quase " + 
			"qualquer cenário.";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public Procurado() {
		super(nome, desc, tipoPossivel);
	}
	
	public Procurado(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
