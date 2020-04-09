package atributo;

import core.Atributo;

public class Espirito extends Atributo {
	public static final String nome = "Espírito";
	public static final String desc = "ESPÍRITO reflete sabedoria interior e força " + 
			"de vontade. Espírito é muito importante, pois " + 
			"ajuda seu personagem a se recuperar do estado " + 
			"Abalado";
	
	public Espirito() {
		
	}
	
	public Espirito(int nivelDado) {
		setNivelDado(nivelDado);
	}
}
