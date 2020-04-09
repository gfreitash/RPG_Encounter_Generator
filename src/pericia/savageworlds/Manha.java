package pericia.savageworlds;

import atributo.Astucia;
import core.Pericia;

public class Manha extends Pericia {
	public static final String nome = "Manha";
	public static final String desc = "Personagens com Manha são capazes de obter " + 
			"informações das ruas, salões ou outros contatos " + 
			"através de subornos, ameaças ou barganhas. " + 
			"Encontrar informação escrita em bibliotecas e " + 
			"similares é coberto pela perícia Investigar. Manha " + 
			"é sempre modificada pelo Carisma do personagem.";
	
	public Manha() {
		super(new Astucia());
	}
	
	public Manha(int nivelDado) {
		super(new Astucia(), nivelDado);
	}
}
