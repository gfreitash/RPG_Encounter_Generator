package vantagem.savageworlds;

import atributo.Vigor;
import core.Progresso;
import requisito.RequisitoAtributo;
import requisito.RequisitoProgresso;

public class CuraRapida extends VantagemAntecedente {
	public static final String nome = "Cura Rápida";
	public static final String desc = "Alguns indivíduos parecem se curar mais " + 
			"rapidamente que os outros. Aqueles com esta " + 
			"benção adicionam +2 a suas rolagens de Vigor " + 
			"em seus testes para cura natural. Veja a página " + 
			"101 para regras completas de Cura.";
	
	public CuraRapida() {
		super(new RequisitoProgresso(new Progresso(0)), new RequisitoAtributo(new Vigor(8)));
	}
}
