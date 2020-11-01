package raca.interfacezero;

import core.NPC;
import core.Raca;

public class Humano extends Raca {
	public static final String NOME = "Humano";
	public static final String DESCRICAO = "A despeito de todas as escolhas e novas raças andando " +
			"por aí, os homo-sapiens normais ainda dominam o planeta. " +
			"Humanos são criaturas duras e adaptáveis, que encaram" +
			"a adversidade de frente. Enquanto eles podem não ter " +
			"algumas das vantagens dos seus pares aprimorados, " +
			"humanos sobrevivem sendo mais adaptáveis. " +
			"\n• Adaptabilidade: Humanos começam com uma Vantagem " +
			"extra.";
	
	public Humano() {
		super(NOME, DESCRICAO);
	}

	@Override
	public void aplicarEfeitos(NPC npc) {

	}
}
