package atributo;

import core.Atributo;

public class Astucia extends Atributo {
	public Astucia(int nivelDado) {
		super("Astúcia", "ASTÚCIA é uma medida de quão bem seu " + 
				"personagem conhece seu mundo e sua cultura, " + 
				"quão bem planeja os seus passos e a sua agilidade " + 
				"mental.", nivelDado);
	}
	
	public Astucia() {
		super("Astúcia", "ASTÚCIA é uma medida de quão bem seu " + 
				"personagem conhece seu mundo e sua cultura, " + 
				"quão bem planeja os seus passos e a sua agilidade " + 
				"mental.");
	}
}
