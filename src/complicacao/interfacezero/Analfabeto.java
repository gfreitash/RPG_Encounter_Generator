package complicacao.interfacezero;

import core.Complicacao;

public class Analfabeto extends Complicacao {
	public static final String nome = "Analfabeto";
	public static final String desc = "Seu herói não consegue ler. Ele provavelmente " + 
			"pode assinar seu nome e sabe o significado de um " + 
			"sinal de PARE, mas não pode fazer muito mais que " + 
			"isso. Também não sabe muito sobre matemática. " + 
			"Consegue provavelmente efetuar 2+2=4, mas " + 
			"multiplicações e similares estão fora do seu alcance. " + 
			"A propósito, analfabetos não podem ler ou" + 
			"escrever em nenhum idioma, não importa quantos " + 
			"eles realmente falem.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Analfabeto() {
		
	}
	
	public Analfabeto(String tipo) {
		super(tipo);
	}
}
