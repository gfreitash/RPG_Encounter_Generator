package vantagem.savageworlds;

import atributo.Vigor;
import core.Progresso;
import core.Requisito;

public class Atraente extends VantagemAntecedente {
	private static final String nome = "Atraente";
	private static final String desc = "Não é segredo que pessoas bonitas têm mais " + 
			"facilidade em seguir o seu caminho na vida. " + 
			"Esta Vantagem concede +2 no Carisma do seu " + 
			"personagem belo ou atraente.";
	
	public Atraente() {
		super(nome, desc, new Requisito(new Progresso(0)), new Requisito(new Vigor(6)));
	}
}
