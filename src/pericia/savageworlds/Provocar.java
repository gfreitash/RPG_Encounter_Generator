package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Provocar extends Pericia {
	public static final String nome = "Provocar";
	public static final String desc = "Provocar é um Teste de Vontade contra o orgulho " + 
			"de uma pessoa através de zombaria, piadas cruéis " + 
			"ou humilhação. É uma rolagem resistida contra " + 
			"a Astúcia do inimigo.";
	
	public Provocar() {
		super(nome, desc, Atributo.ASTUCIA);
	}
	
	public Provocar(int nivelDado) {
		super(nome, desc, Atributo.ASTUCIA, nivelDado);
	}
}
