package raca.interfacezero;

import core.Raca;

public class Humano extends Raca {
	private static final String nome = "Humano";
	private static final String desc = "A despeito de todas as escolhas e novas raças andando " + 
			"por aí, os homo-sapiens normais ainda dominam o planeta. " + 
			"Humanos são criaturas duras e adaptáveis, que encaram" + 
			"a adversidade de frente. Enquanto eles podem não ter " + 
			"algumas das vantagens dos seus pares aprimorados, " + 
			"humanos sobrevivem sendo mais adaptáveis. " + 
			"\n• Adaptabilidade: Humanos começam com uma Vantagem " + 
			"extra.";
	
	public Humano() {
		super(nome, desc);
	}

	@Override
	protected void setModificadores() {
		// TODO Auto-generated method stub
		
	}
}
