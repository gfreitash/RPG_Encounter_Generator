package raca.interfacezero;

import core.NPC;
import core.Raca;

public class HibridoAquatico extends Hibrido {
	private static final String NOME = "Aquático";
	private static final String DESCRICAO = """
			Exemplos de Animais: Golfinho, Tubarão, Crocodilo
			• Aquático: Híbridos aquáticos não podem se afogar, começam com um d6 em Nadar e podem se deslocar a sua Movimentação total debaixo da água.
			• Desidratação: Um híbrido aquático tem que mergulhar em água uma hora a cada 24 horas ou fica automaticamente Fatigado a cada dia até que ele fique Incapacitado; no dia após isso, ele morre.
			• Visão No Escuro: Híbridos Aquáticos ignoram os redutores para Penumbra e Baixa Visibilidade e podem ver em qualquer situação, exceto escuridão total.
			• Arma Natural: Híbridos Aquáticos nunca são considerados desarmados e causam For+d6 de dano quando fazem um ataque desarmado.""";

	public HibridoAquatico() {
		super(NOME, DESCRICAO);
	}

	@Override
	public void aplicarEfeitos(NPC npc) {

	}
}
