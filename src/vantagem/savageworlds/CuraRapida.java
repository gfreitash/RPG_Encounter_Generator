package vantagem.savageworlds;

import atributo.Vigor;
import core.Progresso;
import core.Requisito;

public class CuraRapida extends VantagemAntecedente {
	private static final String nome = "Cura Rápida";
	private static final String desc = "Alguns indivíduos parecem se curar mais " + 
			"rapidamente que os outros. Aqueles com esta " + 
			"benção adicionam +2 a suas rolagens de Vigor " + 
			"em seus testes para cura natural. Veja a página " + 
			"101 para regras completas de Cura.";
	
	public CuraRapida() {
		super(nome, desc, new Requisito(new Progresso(0)), new Requisito(new Vigor(8)));
	}
}
