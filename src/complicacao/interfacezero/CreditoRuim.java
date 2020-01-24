package complicacao.interfacezero;

import core.Complicacao;
import core.Membro;

public class CreditoRuim extends Complicacao {
	public CreditoRuim(String tipo, Membro m) {
		super("Crédito Ruim nas Ruas", "Seu personagem arruinou seriamente uma missão, "
				+ "o que subtrai permanentemente 1 do seu Crédito nas Ruas.", 
				tipo, "Menor");
		aplicarModificadores(m);
	}
	
	public void aplicarModificadores(Membro m) {
		m.subtractCreditoDasRuas(1);
	}
}
