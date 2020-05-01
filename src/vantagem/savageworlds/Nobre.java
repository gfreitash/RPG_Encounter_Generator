package vantagem.savageworlds;

import core.Progresso;
import requisito.RequisitoProgresso;

public class Nobre extends VantagemAntecedente {
	public static final String nome = "Nome";
	public static final String desc = "Aqueles nascidos de sangue nobre têm " + 
			"muitos privilégios na vida, mas frequentemente " + 
			"possuem também muitas responsabilidades. " + 
			"Nobres possuem posição elevada em suas " + 
			"sociedades, têm direto a tratamento especial " + 
			"de seus inimigos, recebem +2 de Carisma e " + 
			"também possuem a Vantagem Rico. Isso dá ao " + 
			"herói diversas Vantagens pelo preço de uma, mas " + 
			"as responsabilidades mais do que compensam " + 
			"os privilégios adicionais. Nobres normalmente " + 
			"possuem tropas sob o seu comando, bem como " + 
			"uma terra, uma casa de sua família e outras " + 
			"posses. Tudo isso deve ser determinado pelo " + 
			"Mestre e equilibrado pelos sérios encargos " + 
			"enfrentados pelo personagem. " + 
			"Como exemplo, um personagem em " + 
			"uma campanha de fantasia poderia ter uma " + 
			"companhia de espadachins, um pequeno forte e " + 
			"mesmo uma espada mágica herdada de seu pai. " + 
			"Entretanto, também teria uma região inteira " + 
			"para administrar, criminosos para julgar, justiça " + 
			"para aplicar e um vizinho invejoso cobiçando a " + 
			"sua terra e constantemente conspirando contra " + 
			"ele na corte.";
	
	public Nobre() {
		super(nome, desc, new RequisitoProgresso(new Progresso(0)));
	}
}
