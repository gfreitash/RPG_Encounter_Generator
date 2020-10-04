package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Perceber extends Pericia {
	public static final String nome = "Perceber";
	public static final String desc = "Perceber é a prontidão geral e habilidade de " + 
			"um herói para procurar por itens ou pistas. Isso " + 
			"cobre rolagens para ouvir, detectar emboscadas, " + 
			"enxergar armas escondidas e até mesmo examinar " + 
			"outros personagens para ver se estão mentindo, " + 
			"assustados e assim por diante. Quanto mais " + 
			"ampliações um personagem consegue em uma " + 
			"rolagem de Perceber, mais informações o Mestre " + 
			"deve revelar.";
	
	public Perceber() {
		super(nome, desc, Atributo.AGILIDADE);
	}
	
	public Perceber(int nivelDado) {
		super(nome, desc, Atributo.AGILIDADE, nivelDado);
	}
}
