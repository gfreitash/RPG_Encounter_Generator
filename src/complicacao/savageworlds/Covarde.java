package complicacao.savageworlds;

import core.Complicacao;

public class Covarde extends Complicacao {
	public static final String nome = "Covarde";
	public static final String desc = "Nem todo mundo possui água gelada em suas " + 
			"veias. Seu herói é suscetível à visão de sangue e " + 
			"vísceras e tem medo de se machucar. Ele subtrai " + 
			"2 de todos os seus testes de Espírito baseados em " + 
			"medo.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Covarde() {
		super(nome, desc, tipoPossivel);
	}
	
	public Covarde(String tipo) {
		super(nome ,desc, tipoPossivel, tipo);
	}
}
