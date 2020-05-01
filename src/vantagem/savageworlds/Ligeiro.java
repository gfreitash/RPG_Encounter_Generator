package vantagem.savageworlds;

import atributo.Agilidade;
import core.Progresso;
import requisito.RequisitoAtributo;
import requisito.RequisitoProgresso;

public class Ligeiro extends VantagemAntecedente {
	public static final String nome = "Ligeiro";
	public static final String desc = "A Movimentação do herói é aumentada em " + 
			"+2 e ele rola um d10 ao invés de um d6 para " + 
			"correr.";
	
	public Ligeiro() {
		super(nome, desc, new RequisitoProgresso(new Progresso(0)), new RequisitoAtributo(new Agilidade(6)));
	}
}
