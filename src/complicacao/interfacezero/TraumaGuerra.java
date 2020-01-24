package complicacao.interfacezero;

import core.Complicacao;

public class TraumaGuerra extends Complicacao {
	public TraumaGuerra(String tipo) {
		super("Trauma de Guerra", "O personagem tem uma tendência de congelar em combate. "
				+ "Ele começa o primeiro turno de combate Abalado. Esta condição pode "
				+ "ser removida normalmente.", tipo, "Maior");
	}
}
