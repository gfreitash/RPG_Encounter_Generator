package atributo;

import core.Atributo;

public class Espirito extends Atributo {
	public Espirito(int nivelDado) {
		super("Espírito", "ESPÍRITO reflete sabedoria interior e força " + 
				"de vontade. Espírito é muito importante, pois " + 
				"ajuda seu personagem a se recuperar do estado " + 
				"Abalado", nivelDado);
	}
	public Espirito() {
		super("Espírito", "ESPÍRITO reflete sabedoria interior e força " + 
				"de vontade. Espírito é muito importante, pois " + 
				"ajuda seu personagem a se recuperar do estado " + 
				"Abalado");
	}
}
