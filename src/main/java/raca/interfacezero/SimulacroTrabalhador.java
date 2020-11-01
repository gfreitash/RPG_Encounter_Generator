package raca.interfacezero;

import core.NPC;

public class SimulacroTrabalhador extends Simulacro {
	public static final String NOME = "Trabalhador";
	public static final String DESCRICAO = """
			O tipo mais comum, o simulacro trabalhador lida com trabalhos considerados perigosos ou inferiores demais para humanos, mas que ainda requerem a flexibilidade de uma forma humanóide. A maioria dos trabalhadores simulacros são construídos pensando na durabilidade e lealdade, e os lotes tendem a ser parecidos. Modelos trabalhador são desenvolvidos para durar independente do seu trabalho específico.\s
			• Vida Útil (Menor): Simulacros trabalhadores são projetados para viver apenas por dez anos. Role um d6+4 para determinar quantos anos o seu personagem ainda tem.\s
			• Criado para o Trabalho: +2 para resistir a todos os tipos de efeitos ambientais negativos (calor, frio, etc.).\s
			• Sólido: Um simulacro trabalhador começa com um d6 em Vigor
			• Estigma: Simus sofrem da Complicação Forasteiro quando agem fora de seu papel designado como trabalhador.""";

	public SimulacroTrabalhador() {
		super(NOME, DESCRICAO);
	}

	@Override
	public void aplicarEfeitos(NPC npc) {

	}
}
