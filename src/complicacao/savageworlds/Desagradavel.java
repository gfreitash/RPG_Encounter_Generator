package complicacao.savageworlds;

import core.Complicacao;
import core.Membro;

public class Desagradavel extends Complicacao {
	public static final String nome = "Desagradável";
	public static final String desc = "Este camarada é mal-humorado e desagradável. " + 
			"Ninguém gosta dele e ele tem dificuldades em fazer " + 
			"qualquer coisa gentil pra quem quer que seja. Ele " + 
			"deve ser pago pelos seus aborrecimentos e nem " + 
			"mesmo aceita premiações graciosamente. Seu " + 
			"herói sofre -2 no seu Carisma.";
	public static final String tipoPossivel[] = {"Menor"};
	
	public Desagradavel() {
		super();
	}
	
	public Desagradavel(String tipo, Membro m) {
		super(tipo);
	}
}
