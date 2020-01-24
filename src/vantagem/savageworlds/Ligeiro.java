package vantagem.savageworlds;

import atributo.Agilidade;
import core.Progresso;
import core.Requisito;

public class Ligeiro extends VantagemAntecedente {
	private static final String nome = "Ligeiro";
	private static final String desc = "A Movimentação do herói é aumentada em " + 
			"+2 e ele rola um d10 ao invés de um d6 para " + 
			"correr.";
	
	public Ligeiro() {
		super(nome, desc, new Requisito(new Progresso(0)), new Requisito(new Agilidade(6)));
	}
}
