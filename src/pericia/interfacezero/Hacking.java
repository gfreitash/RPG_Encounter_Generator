package pericia.interfacezero;

import core.Pericia;

public class Hacking extends Pericia {
	private static String desc = "A perícia Hacking e usada sempre que " + 
			"um personagem quer invadir uma rede de computadores. " + 
			"Personagens em Interface Zero 2.0 não mais começam " + 
			"com um d4 automático em Hacking. Além disso, personagens " + 
			"que desejem usar a DataNet Global para propósitos " + 
			"cotidianos como pesquisa ou encontrar notícias na Deep, " + 
			"o fazem com suas perícias de Investigar e Manha";
	
	public Hacking() {
		super("Hacking", desc, new atributo.Astucia());
	}
	
	public Hacking(int nivelDado) {
		super("Hacking", desc, new atributo.Astucia(), nivelDado);
	}
}
