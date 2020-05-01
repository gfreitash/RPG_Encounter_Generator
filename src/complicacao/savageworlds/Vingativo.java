package complicacao.savageworlds;

import core.Complicacao;

public class Vingativo extends Complicacao {
	public static final String nome = "Vingativo";
	public static final String desc = "Seu personagem sempre tenta reparar um erro " + 
			"que sinta ter sido cometido contra ele. Se essa " + 
			"for uma Complicação Menor, ele normalmente " + 
			"procura por vingança legalmente. O tipo e a " + 
			"urgência de sua vingança variam de personagem " + 
			"para personagem, é claro. Alguns conspiram " + 
			"e planejam por meses para conseguir o que " + 
			"enxergam como justiça. " + 
			"Se essa for uma Complicação Maior, seu " + 
			"personagem matará para retificar a sua injustiça.";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public Vingativo() {
		super(nome, desc, tipoPossivel);
	}
	
	public Vingativo(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
