package complicacao.savageworlds;

import core.Complicacao;

public class Jovem extends Complicacao {
	public static final String nome = "Jovem";
	public static final String desc = "Crianças às vezes são forçadas a partir em " + 
			"aventuras perigosas devido a circunstâncias " + 
			"infelizes. Pense cuidadosamente antes de escolher " + 
			"esta Complicação, pois seu jovem começará com " + 
			"uma desvantagem significativa. " + 
			"Heróis jovens geralmente têm entre 8-12 anos " + 
			"de idade (em anos humanos – faça os devidos " + 
			"ajustes para raças com paradigmas diferentes de " + 
			"envelhecimento). Têm apenas três pontos para " + 
			"ajustar os seus atributos e 10 pontos de perícia. " + 
			"Em compensação, jovens como estes têm certa " + 
			"porção de sorte. Eles sacam um Bene adicional " + 
			"no início de cada sessão de jogo, em adição a " + 
			"quaisquer Benes adicionais ganhos de coisas " + 
			"como as Vantagens Sorte e Sorte Grande. " + 
			"Se o personagem viver tempo o suficiente " + 
			"para atingir a maturidade, a Complicação não " + 
			"precisa ser paga, pois o preço já foi pago pela " + 
			"Complicação por ter começado em desvantagem. " + 
			"Entretanto, ele deixa de receber o Bene adicional " + 
			"ao completar 18 anos de idade (ou a idade da " + 
			"maioridade do cenário em questão).";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Jovem() {
		super(nome, desc, tipoPossivel);
	}
	
	public Jovem(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
