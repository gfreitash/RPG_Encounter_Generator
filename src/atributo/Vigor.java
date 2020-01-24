package atributo;

import core.Atributo;

public class Vigor extends Atributo {
	public Vigor(int nivelDado) {
		super("Vigor", "VIGOR representa a tolerância, resistência " + 
				"a doenças, venenos ou toxinas e quanta dor e " + 
				"dano físico um herói pode suportar.", nivelDado);
	}
	public Vigor() {
		super("Vigor", "VIGOR representa a tolerância, resistência " + 
				"a doenças, venenos ou toxinas e quanta dor e " + 
				"dano físico um herói pode suportar.");
	}
}
