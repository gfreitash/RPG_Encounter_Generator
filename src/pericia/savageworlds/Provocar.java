package pericia.savageworlds;

import atributo.Astucia;
import core.Pericia;

public class Provocar extends Pericia {
	public static final String nome = "Provocar";
	public static final String desc = "Provocar é um Teste de Vontade contra o orgulho " + 
			"de uma pessoa através de zombaria, piadas cruéis " + 
			"ou humilhação. É uma rolagem resistida contra " + 
			"a Astúcia do inimigo.";
	
	public Provocar() {
		super(new Astucia());
	}
	
	public Provocar(int nivelDado) {
		super(new Astucia(), nivelDado);
	}
}
