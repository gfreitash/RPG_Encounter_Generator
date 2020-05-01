package complicacao.interfacezero;

import core.Complicacao;

public class GatilhoEstresse extends Complicacao {
	public static final String nome = "Gatilho por Estresse";
	public static final String desc = "A maioria dos zeeks tenta manter o controle "
			+ "sobre seus poderes, mas um personagem com esta Complicação "
			+ "parece não conseguir lidar com eles o tempo todo. Se ele for "
			+ "confrontado com uma situação estressante, existe a tendência "
			+ "desagradável de que suas habilidades psiônicas se manifestem. "
			+ "Como uma Complicação Menor, o que isso significa é que sempre "
			+ "que o personagem é forçado a fazer um teste de atributo para "
			+ "resistir a algo — seja um teste de Espírito para manter "
			+ "a moral ou um teste de Força em uma competição de queda de braço"
			+ " — se o resultado for uma falha crítica, o personagem deve "
			+ "tentar usar um dos seus poderes psiônicos com sua próxima ação. "
			+ "Sim, isso também se aplica a Testes de Vontade e de Absorção. "
			+ "Como uma Complicação Maior, qualquer falha em uma dessas rolagens "
			+ "resulta em uso obrigatório do poder. Em ambos os casos, o personagem "
			+ "pode gastar um Bene para evitar o uso forçado do poder. Esta "
			+ "Complicação pode ser assumida por um personagem com as Vantagens "
			+ "Antecedente Arcano (Psiônicos) ou Talento Selvagem.";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public GatilhoEstresse() {
		super(nome, desc, tipoPossivel);
	}

	public GatilhoEstresse(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
