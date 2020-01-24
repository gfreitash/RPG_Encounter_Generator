package pericia.savageworlds;

import core.Pericia;

public class Atirar extends Pericia {
	private static String desc = "Atirar cobre todas as tentativas de atingir um " + 
			"alvo com armas de combate a distância como " + 
			"arcos, pistolas ou lança-foguetes. A Dificuldade " + 
			"básica para acertar é 4. Contudo, existe um número " + 
			"importante de modificadores, como a distância em " + 
			"que o alvo se encontra, aparecendo frequentemente " + 
			"no jogo.";
	
	 public Atirar() {
		super("Atirar", desc, new atributo.Agilidade());
	}
	 
	 public Atirar(int nivelDado) {
			super("Atirar", desc, new atributo.Agilidade(), nivelDado);
		}
}
