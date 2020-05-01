package atributo;

import core.Atributo;

public class Astucia extends Atributo {
	public static final String nome = "Astúcia";
	public static final String desc = "ASTÚCIA é uma medida de quão bem seu "
			+ "personagem conhece seu mundo e sua cultura, " + "quão bem planeja os seus passos e a sua agilidade "
			+ "mental.";

	public Astucia() {
		super(nome, desc);
	}

	public Astucia(int nivelDado) {
		super(nome, desc);
		setNivelDado(nivelDado);
	}

}
