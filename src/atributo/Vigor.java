package atributo;

import core.Atributo;

public class Vigor extends Atributo {
	public static final String nome = "Vigor";
	public static final String desc = "VIGOR representa a tolerância, resistência " + 
			"a doenças, venenos ou toxinas e quanta dor e " + 
			"dano físico um herói pode suportar.";
	
	public Vigor() {
		super(nome, desc);
	}
	
	public Vigor(int nivelDado) {
		super(nome, desc);
		setNivelDado(nivelDado);
	}
}
