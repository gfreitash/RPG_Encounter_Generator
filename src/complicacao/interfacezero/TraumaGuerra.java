package complicacao.interfacezero;

import core.Complicacao;

public class TraumaGuerra extends Complicacao {
	public static final String nome = "Trauma de Guerra";
	public static final String desc = "O personagem tem uma tendência de congelar em combate. "
			+ "Ele começa o primeiro turno de combate Abalado. Esta condição pode "
			+ "ser removida normalmente.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public TraumaGuerra() {
		super(nome, desc, tipoPossivel);
	}

	public TraumaGuerra(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
