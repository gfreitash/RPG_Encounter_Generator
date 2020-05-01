package complicacao.interfacezero;

import core.Complicacao;

public class Magnetico extends Complicacao {
	public static final String nome = "Magnético";
	public static final String desc = "Quer seja sua aparência, fama, ou outra coisa que você " + 
			"não pode explicar, certas pessoas acham o seu herói " + 
			"muito atraente. Infelizmente, elas nunca são aquelas que " + 
			"ele deseja que estivessem atraídas por ele. Como uma " + 
			"Complicação Menor, um ou dois fãs aparecem como um " + 
			"inconveniente ou uma distração ocasional. A versão Maior " + 
			"tem turbas de fãs que o deixam em sérios apuros. Imagine " + 
			"tentar fazer um trabalho enquanto é perseguido por meia " + 
			"dúzia de repórteres! Exemplos de fãs incluem pretensos " + 
			"criminosos esperando ficarem bem quistos, jornalistas ou " + 
			"produtores de reality shows.";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public Magnetico() {
		super(nome, desc, tipoPossivel);
	}

	public Magnetico(String tipo) {
		super(nome, desc, tipoPossivel, tipo); 
	}
}
