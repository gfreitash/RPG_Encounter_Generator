package vantagem.savageworlds;

import core.Progresso;
import core.Requisito;

public class Furioso extends VantagemAntecedente {
	private static final String nome = "Furioso";
	private static final String desc = "Logo após sofrer um ferimento (incluindo um " + 
			"resultado de Abalado por dano físico), seu herói " + 
			"precisa fazer uma rolagem de Astúcia ou entrará " + 
			"em fúria. " + 
			"Enquanto em fúria, seu Aparar é reduzido " + 
			"em 2, mas adiciona +2 em todas as rolagens de " + 
			"Lutar, Força, dano de combate corpo a corpo " + 
			"e Resistência. O guerreiro ignora todos os " + 
			"modificadores de ferimento enquanto em fúria, " + 
			"mas não pode usar quaisquer perícias, Vantagens " + 
			"ou manobras que exijam concentração, incluindo " + 
			"Atirar e Provocar, exceto Intimidar. " + 
			"Furiosos atacam de forma imprudente. " + 
			"Sempre que seu dado de Lutar for um 1 " + 
			"(independente do seu Dado Selvagem), ele " + 
			"atinge um alvo adjacente aleatório (não o alvo " + 
			"original). O ataque pode atingir tanto um amigo " + 
			"quanto um inimigo. Se não houver outros alvos " + 
			"adjacentes, o golpe simplesmente erra. " + 
			"O personagem pode encerrar sua fúria não " + 
			"fazendo nada (nem mesmo se mover) por uma " + 
			"ação completa e efetuando uma rolagem de " + 
			"Astúcia com -2.";
	
	public Furioso() {
		super(nome, desc, new Requisito(new Progresso(0)));
	}
}
