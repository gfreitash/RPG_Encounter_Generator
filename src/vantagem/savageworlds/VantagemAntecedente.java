package vantagem.savageworlds;

import core.Vantagem;
import core.Requisito;

public abstract class VantagemAntecedente extends Vantagem{
	private static final String tipo = "Vantagem de Antecedente";
	private static final String tipoDesc = "Estas Vantagens são benefícios hereditários e " + 
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
	
	protected VantagemAntecedente(String nome, String desc, Requisito ... requisitos) {
		super(nome, desc, tipo, tipoDesc, requisitos);
	}
}
