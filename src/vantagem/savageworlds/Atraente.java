package vantagem.savageworlds;

import atributo.Vigor;
import core.Progresso;
import requisito.RequisitoAtributo;
import requisito.RequisitoProgresso;

public class Atraente extends VantagemAntecedente {
	public static final String nome = "Atraente";
	public static final String desc = "Não é segredo que pessoas bonitas têm mais " + 
			"facilidade em seguir o seu caminho na vida. " + 
			"Esta Vantagem concede +2 no Carisma do seu " + 
			"personagem belo ou atraente.";
	
	public Atraente() {
		super(nome, desc, new RequisitoProgresso(new Progresso(0)), new RequisitoAtributo(new Vigor(6)));
	}
}
