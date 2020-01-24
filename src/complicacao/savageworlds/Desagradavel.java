package complicacao.savageworlds;

import core.Complicacao;
import core.Membro;

public class Desagradavel extends Complicacao {
	public Desagradavel(String tipo, Membro m) {
		super("Desagradável", "Este camarada é mal-humorado e desagradável. " + 
				"Ninguém gosta dele e ele tem dificuldades em fazer " + 
				"qualquer coisa gentil pra quem quer que seja. Ele " + 
				"deve ser pago pelos seus aborrecimentos e nem " + 
				"mesmo aceita premiações graciosamente. Seu " + 
				"herói sofre -2 no seu Carisma.", tipo, "Menor");
		
		aplicarModificadores(m);
	}
	
	public void aplicarModificadores(Membro m) {
		m.addCarisma((byte) -2);
	}
}
