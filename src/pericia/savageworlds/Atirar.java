package pericia.savageworlds;

import atributo.Agilidade;
import core.Pericia;

public class Atirar extends Pericia {
	public static final String nome = "Atirar";
	public static final String desc = "Atirar cobre todas as tentativas de atingir um " + 
			"alvo com armas de combate a distância como " + 
			"arcos, pistolas ou lança-foguetes. A Dificuldade " + 
			"básica para acertar é 4. Contudo, existe um número " + 
			"importante de modificadores, como a distância em " + 
			"que o alvo se encontra, aparecendo frequentemente " + 
			"no jogo.";
	
	 public Atirar() {
		super(nome, desc, new Agilidade());
	}
	 
	 public Atirar(int nivelDado) {
			super(nome, desc, new Agilidade(), nivelDado);
		}
}
