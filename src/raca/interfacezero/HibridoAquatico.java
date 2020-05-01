package raca.interfacezero;

import core.Raca;

public class HibridoAquatico extends Raca implements Hibrido {
	private static final String nome = "Híbrido Aquático";
	private static final String desc = "Exemplos de Animais: Golfinho, Tubarão, Crocodilo"
			+ "\n• Aquático: Híbridos aquáticos não podem se afogar, começam com um d6 em "
			+ "Nadar e podem se deslocar a sua Movimentação total debaixo da água."
			+ "\n• Desidratação: Um híbrido aquático tem que mergulhar em água uma hora "
			+ "a cada 24 horas ou fica automaticamente Fatigado a cada dia até que ele "
			+ "fique Incapacitado; no dia após isso, ele morre."
			+ "\n• Visão No Escuro: Híbridos Aquáticos ignoram os redutores para Penumbra "
			+ "e Baixa Visibilidade e podem ver em qualquer situação, exceto escuridão total."
			+ "\n• Arma Natural: Híbridos Aquáticos nunca são considerados desarmados "
			+ "e causam For+d6 de dano quando fazem um ataque desarmado.";
	
	public HibridoAquatico() {
		super(nome, desc);
	}
	
}
