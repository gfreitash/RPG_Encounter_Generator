package vantagem.savageworlds;

import core.Vantagem;
import requisito.Requisito;

public abstract class VantagemAntecedente extends Vantagem{
	public static final String tipo = "Vantagem de Antecedente";
	public static final String desc_tipo = "Estas Vantagens são benefícios hereditários e " + 
			"históricos ou reações treinadas que se desenvolvem " + 
			"em um personagem depois de treinamento " + 
			"prolongado ou exposição a certos eventos. " + 
			"Jogadores podem escolher estas Vantagens " + 
			"depois da criação do personagem, mas o Mestre " + 
			"pode exigir um pouco mais de racionalização. " + 
			"Alguém pode escolher a Vantagem Atraente, " + 
			"por exemplo, se arrumando, passando por uma " + 
			"transformação e geralmente dando mais atenção " + 
			"a sua aparência. Personagens também podem " + 
			"ser capazes de ganhar a Vantagem Antecedente " + 
			"Arcano, caso encontrem um livro de conhecimento " + 
			"proibido ou treinando sob a tutela de outro " + 
			"indivíduo arcano no seu grupo.";
	
	protected VantagemAntecedente(String nome, String desc) {
		super(nome, desc, tipo, desc_tipo);
	}
	
	protected VantagemAntecedente(String nome, String desc, Requisito ... requisitos) {
		super(nome, desc, tipo, desc_tipo, requisitos);
	}

}
