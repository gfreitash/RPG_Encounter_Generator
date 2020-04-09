package complicacao.interfacezero;

import core.Complicacao;

public class Propriedade extends Complicacao {
	public static final String nome = "Propriedade";
	public static final String desc = "Seja por procedimentos experimentais que o mantêm " + 
			"vivo, ou um contrato de servidão para pagar uma grande " + 
			"dívida, sua liberdade individual é bastante dificultada porque " + 
			"você é, para todos os efeitos e propósitos, propriedade do " + 
			"megaconglomerado que possui o seu contrato. Esta Complicação " + 
			"é muito comum para simulacros, andróides e híbridos " + 
			"trabalhando no setor corporativo. Na maior parte, esta Complicação " + 
			"significa que você tem pouco a opinar sobre suas " + 
			"ações; não é incomum para você receber ordens com a " + 
			"expectativa que você as cumprirá. No fim de uma longa e " + 
			"perigosa missão para os donos do seu contrato, você pode " + 
			"pagar por esta Complicação gastando um Progresso uma " + 
			"vez que atinja o Estágio Experiente.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Propriedade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Propriedade(String tipo) {
		super(tipo);
	}
}
