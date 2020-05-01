package complicacao.interfacezero;

import core.Complicacao;

public class UmOlhoSo extends Complicacao {
	public static final String nome = "Um Olho Só";
	public static final String desc = "Seu herói perdeu um olho por alguma razão " + 
			"desafortunada. Se não usar um tapa-olho ou " + 
			"comprar um substituto de vidro (normalmente " + 
			"$500), sofre -1 no seu Carisma pelo ferimento " + 
			"grotesco. " + 
			"Sofre -2 em qualquer rolagem de Característica " + 
			"que exija percepção de profundidade, como " + 
			"Arremessar ou Atirar, saltar uma ravina ou " + 
			"telhado e assim por diante." + "No mundo de Interface Zero 2.0, "
			 + "a medicina avançou ao " + 
			"ponto em que a Complicação listada " + 
			"acima pode ser removida com um simples procedimento " + 
			"médico. Por causa disso, qualquer personagem que assuma " + 
			"essas Complicações na criação de personagem, e então " + 
			"usa Aprimoramentos em jogo para removê-las, também " + 
			"deve gastar um Progresso. Aqueles que assumem essas " + 
			"Complicações na criação de personagem não podem anular " + 
			"os seus efeitos com Aprimoramentos durante a criação de " + 
			"personagem.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public UmOlhoSo() {
		super(nome, desc, tipoPossivel);
	}

	public UmOlhoSo(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
