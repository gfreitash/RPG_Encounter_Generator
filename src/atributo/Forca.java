package atributo;

import core.Atributo;

public class Forca extends Atributo {
	public static final String nome = "Força";
	public static final String desc = "FORÇA representa força bruta e aptidão física " + 
			"no geral. Força também é usada para gerar o dano " + 
			"do seu guerreiro em combate corpo a corpo.";
	
	public Forca() {
		
	}
	
	public Forca(int nivelDado) {
		setNivelDado(nivelDado);
	}
}
