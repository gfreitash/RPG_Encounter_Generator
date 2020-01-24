package complicacao.savageworlds;

import core.Complicacao;

public class Anemico extends Complicacao {
	public Anemico(String tipo) {
		super("Anêmico", "Um personagem anêmico é particularmente " + 
				"suscetível a infecções, doenças, efeitos ambientais " + 
				"e fadiga. Ele subtrai 2 de todos os testes de Fadiga " + 
				"como os feitos para resistir a veneno e doença", tipo, "Menor");
	}
}
