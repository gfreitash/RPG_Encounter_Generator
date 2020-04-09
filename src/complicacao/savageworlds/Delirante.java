package complicacao.savageworlds;

import core.Complicacao;

public class Delirante extends Complicacao {
	public static final String nome = "Delirante";
	public static final String desc = "Seu herói acredita em algo considerado muito " + 
			"estranho por todos os outros. Delírios Menores " + 
			"são inofensivos ou o personagem normalmente os " + 
			"guarda para si mesmo (o governo colocou sedativos " + 
			"em refrigerantes, cães podem falar, somos todos " + 
			"apenas personagens de algum jogo bizarro etc.). " + 
			"Com Delírios Maiores, ele frequentemente " + 
			"expressa seu ponto de vista sobre a situação e isso " + 
			"pode eventualmente levá-lo ao perigo (o governo " + 
			"é comandado por alienígenas, os hospitais são " + 
			"mortais, eu sou alérgico a armaduras, zumbis são " + 
			"meus amigos).";
	
	public Delirante(String tipo) {
		super(tipo, "Menor", "Maior");
	}
}
