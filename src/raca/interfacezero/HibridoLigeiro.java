package raca.interfacezero;

import core.Raca;

public class HibridoLigeiro extends Raca implements Hibrido {
	private static final String nome = "Híbrido Ligeiro";
	private static final String desc = "Exemplos de Animais: Raposa, Falcão, Mangusto, Macaco, Cobra"
			+ "\n• Ágil: Híbridos ligeiros começam com um d6 em Agilidade."
			+ "\n• Rápido: Híbridos ligeiros começam com com uma Movimentação básica de 10 quadros."
			+ "\n• Frágil: Híbridos ligeiros tendem a ter uma constituição frágil e tem -1 em Resistência.";
	
	public HibridoLigeiro()	{
		super(nome, desc);
	}
	
}
