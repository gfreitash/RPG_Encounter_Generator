package pericia.savageworlds;

import core.Pericia;

public class Investigar extends Pericia {
	private static String desc = "Um personagem treinado em Investigar sabe " + 
			"como fazer bom uso de bibliotecas, manchetes de " + 
			"jornais, internet ou outros recursos escritos de " + 
			"informação. Para obter informações de pessoas " + 
			"ao invés de livros e computadores, use a perícia " + 
			"Manha.";
	
	public Investigar() {
		super("Investigar", desc, new atributo.Astucia());
	}
	
	public Investigar(int nivelDado) {
		super("Investigar", desc, new atributo.Astucia(), nivelDado);
	}
}
