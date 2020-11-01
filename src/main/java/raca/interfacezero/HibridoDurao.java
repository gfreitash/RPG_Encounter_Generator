package raca.interfacezero;

import core.NPC;

public class HibridoDurao extends Hibrido{
	public static final String NOME = "Durão";
	public static final String DESCRICAO = """
			Exemplos de Animais: Rinoceronte, Touro, Urso, Javali
			• Grande: Híbridos durões são maiores que humanos, e tem +1 de Tamanho.
			• Lento: Durante e a criação de personagem, custa 2 pontos para aumentar o atributo Agilidade em 1 passo para um híbrido durão.
			• Sólido: Híbridos durões começam com um d6 em Vigor.""";
	
	public HibridoDurao() {
		super(NOME, DESCRICAO);
	}

	@Override
	public void aplicarEfeitos(NPC npc) {

	}
}
