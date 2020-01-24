package raca.interfacezero;

import core.Raca;

public class Humano2 extends Raca {
	private static final String nome = "Humano 2.0";
	private static final String desc = "\n• Habilidade Avançada: Você começa o jogo com um atributo em d6."
			+ "\n• Arrogante: Humanos 2.0 são conhecidos pelos seus grandes egos. Quer trate-se de "
			+ "natureza ou de criação ainda está em debate. Eles têm a Complicação Arrogante. "
			+ "Se você escolher um Arquétipo que já tenha a Complicação Arrogante, escolha "
			+ "outra Complicação Maior."
			+ "\n• Pessoas Belas: Humanos 2.0 começam com a Vantagem Atraente."
			+ "\n• Anomalia Genética: Escolha uma característica que não é a sua habilidade avançada."
			+ " Custa 2 pontos para aumentar esse atributo em 1 dado durante e criação de personagem."
			+ "\n• Letrado: Escolha uma perícia ligada a sua habilidade avançada. Você começa o jogo "
			+ "com um d6 naquela perícia."
			+ "\n• Sistema Imunológico Superior: bônus de +4 para resistir efeitos de doenças.";
	
	public Humano2() {
		super(nome, desc);
	}
	@Override
	protected void setModificadores() {
		// TODO Auto-generated method stub

	}

}
