package raca.interfacezero;

import core.Raca;

public class HibridoDurao extends Raca implements Hibrido{
	private static String nome = "Híbrido Durão";
	private static String desc = "Exemplos de Animais: Rinoceronte, Touro, Urso, Javali"
			+ "\n• Grande: Híbridos durões são maiores que humanos, e tem +1 de Tamanho."
			+ "\n• Lento: Durante e a criação de personagem, custa 2 pontos para aumentar"
			+ " o atributo Agilidade em 1 passo para um híbrido durão."
			+ "\n• Sólido: Híbridos durões começam com um d6 em Vigor.";
	
	public HibridoDurao() {
		super(nome, desc);
	}
	@Override
	protected void setModificadores() {
		// TODO Auto-generated method stub

	}

}
