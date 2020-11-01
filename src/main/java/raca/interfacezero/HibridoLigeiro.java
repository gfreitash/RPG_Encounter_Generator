package raca.interfacezero;

import core.NPC;

public class HibridoLigeiro extends Hibrido {
	public static final String NOME = "Ligeiro";
	public static final String DESCRICAO = """
			Exemplos de Animais: Raposa, Falcão, Mangusto, Macaco, Cobra
			• Ágil: Híbridos ligeiros começam com um d6 em Agilidade.
			• Rápido: Híbridos ligeiros começam com com uma Movimentação básica de 10 quadros.
			• Frágil: Híbridos ligeiros tendem a ter uma constituição frágil e tem -1 em Resistência.""";
	
	public HibridoLigeiro()	{
		super(NOME, DESCRICAO);
	}

	@Override
	public void aplicarEfeitos(NPC npc) {

	}
}
