package pericia.savageworlds;

import core.Pericia;

public class Manha extends Pericia {
	private static String desc = "Personagens com Manha são capazes de obter " + 
			"informações das ruas, salões ou outros contatos " + 
			"através de subornos, ameaças ou barganhas. " + 
			"Encontrar informação escrita em bibliotecas e " + 
			"similares é coberto pela perícia Investigar. Manha " + 
			"é sempre modificada pelo Carisma do personagem.";
	
	public Manha() {
		super("Manha", desc, new atributo.Astucia());
	}
	
	public Manha(int nivelDado) {
		super("Manha", desc, new atributo.Astucia(), nivelDado);
	}
}
