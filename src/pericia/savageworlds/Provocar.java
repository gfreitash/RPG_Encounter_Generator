package pericia.savageworlds;

import core.Pericia;

public class Provocar extends Pericia {
	private static String desc = "Provocar é um Teste de Vontade contra o orgulho " + 
			"de uma pessoa através de zombaria, piadas cruéis " + 
			"ou humilhação. É uma rolagem resistida contra " + 
			"a Astúcia do inimigo.";
	
	public Provocar() {
		super("Provocar", desc, new atributo.Astucia());
	}
	
	public Provocar(int nivelDado) {
		super("Provocar", desc, new atributo.Astucia(), nivelDado);
	}
}
