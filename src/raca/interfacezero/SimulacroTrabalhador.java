package raca.interfacezero;

import core.Raca;

public class SimulacroTrabalhador extends Raca implements Simulacro {
	private static final String nome = "Simulacro Trabalhador";
	private static final String desc = "O tipo mais comum, o simulacro trabalhador lida com trabalhos " + 
			"considerados perigosos ou inferiores demais para " + 
			"humanos, mas que ainda requerem a flexibilidade de uma " + 
			"forma humanóide. A maioria dos trabalhadores simulacros " + 
			"são construídos pensando na durabilidade e lealdade, e " + 
			"os lotes tendem a ser parecidos. Modelos trabalhador são " + 
			"desenvolvidos para durar independente do seu trabalho " + 
			"específico. " + 
			"\n• Vida Útil (Menor): Simulacros trabalhadores são projetados " + 
			"para viver apenas por dez anos. Role um d6+4 para " + 
			"determinar quantos anos o seu personagem ainda tem. " + 
			"\n• Criado para o Trabalho: +2 para resistir a todos os tipos " + 
			"de efeitos ambientais negativos (calor, frio, etc.). " + 
			"\n• Sólido: Um simulacro trabalhador começa com um d6 " + 
			"em Vigor" + 
			"\n• Estigma: Simus sofrem da Complicação Forasteiro " + 
			"quando agem fora de seu papel designado como " + 
			"trabalhador.";
	
	public SimulacroTrabalhador() {
		super(nome, desc);
	}
	@Override
	protected void setModificadores() {
		// TODO Auto-generated method stub

	}

}
