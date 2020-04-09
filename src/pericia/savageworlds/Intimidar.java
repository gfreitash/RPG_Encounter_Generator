package pericia.savageworlds;

import atributo.Espirito;
import core.Pericia;

public class Intimidar extends Pericia {
	public static final String nome = "Intimidar";
	public static final String desc = "Intimidar é a arte de aterrorizar um oponente " + 
			"com pura força de vontade, ameaças veladas " + 
			"ou evidentes ou, às vezes, apenas com armas " + 
			"realmente grandes. Essa é uma rolagem resistida " + 
			"entre a Intimidar do herói e o Espírito de seu " + 
			"oponente.";
	
	public Intimidar() {
		super(new Espirito());
	}
	
	public Intimidar(int nivelDado) {
		super(new Espirito(), nivelDado);
	}
}
