package complicacao.interfacezero;

import core.Complicacao;

public class VisaoRuim extends Complicacao {
	public static final String nome = "Visão Ruim";
	public static final String desc = "Os olhos do seu herói já não são mais o que " + 
			"costumavam ser. Com óculos, não há penalidade " + 
			"e a Complicação é apenas Menor. Caso perca " + 
			"seus óculos (geralmente uma chance de 50% " + 
			"quando for ferido ou nenhuma chance com uma " + 
			"“alça nerd”), sofre -2 de penalidade em qualquer " + 
			"rolagem de Característica feita para atirar ou " + 
			"Perceber alguma coisa a mais de 5 quadros (10m) " + 
			"de distância.\r\n" + 
			"Em cenários de baixa tecnologia, onde o herói " + 
			"não possa usar óculos, ter Olhos Ruins é uma " + 
			"Complicação Maior. Ele precisa subtrair 2 das " + 
			"rolagens de Características feitas para atacar ou " + 
			"perceber coisas a 5 quadros ou mais de distância." + 
			"No mundo de Interface Zero 2.0, a medicina avançou ao " + 
			"ponto em que a Complicação listada " + 
			"acima pode ser removida com um simples procedimento " + 
			"médico. Por causa disso, qualquer personagem que assuma " + 
			"essas Complicações na criação de personagem, e então " + 
			"usa Aprimoramentos em jogo para removê-las, também " + 
			"deve gastar um Progresso. Aqueles que assumem essas " + 
			"Complicações na criação de personagem não podem anular " + 
			"os seus efeitos com Aprimoramentos durante a criação de " + 
			"personagem.";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public VisaoRuim() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VisaoRuim(String tipo) {
		super(tipo);
	}
}
