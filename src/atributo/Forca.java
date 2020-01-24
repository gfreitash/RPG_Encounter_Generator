package atributo;

import core.Atributo;

public class Forca extends Atributo {
	public Forca(int nivelDado) {
		super("Força", "FORÇA representa força bruta e aptidão física " + 
				"no geral. Força também é usada para gerar o dano " + 
				"do seu guerreiro em combate corpo a corpo.", nivelDado);
	}
	public Forca(){
		super("Força", "FORÇA representa força bruta e aptidão física " + 
				"no geral. Força também é usada para gerar o dano " + 
				"do seu guerreiro em combate corpo a corpo.");
	}
}
