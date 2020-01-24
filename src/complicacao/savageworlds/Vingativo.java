package complicacao.savageworlds;

import core.Complicacao;

public class Vingativo extends Complicacao {
	public Vingativo(String tipo) {
		super("Vingativo", "Seu personagem sempre tenta reparar um erro " + 
				"que sinta ter sido cometido contra ele. Se essa " + 
				"for uma Complicação Menor, ele normalmente " + 
				"procura por vingança legalmente. O tipo e a " + 
				"urgência de sua vingança variam de personagem " + 
				"para personagem, é claro. Alguns conspiram " + 
				"e planejam por meses para conseguir o que " + 
				"enxergam como justiça. " + 
				"Se essa for uma Complicação Maior, seu " + 
				"personagem matará para retificar a sua injustiça.", tipo, "Menor", "Maior");
	}
}
