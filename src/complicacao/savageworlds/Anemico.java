package complicacao.savageworlds;

import core.Core;

public class Anemico extends Core {
	public static final String nome = "Anêmico";
	public static final String desc = "Um personagem anêmico é particularmente " + 
			"suscetível a infecções, doenças, efeitos ambientais " + 
			"e fadiga. Ele subtrai 2 de todos os testes de Fadiga " + 
			"como os feitos para resistir a veneno e doença";
	
	public Anemico(String tipo) {
		super(tipo, "Menor");
	}
}
