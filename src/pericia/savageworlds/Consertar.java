package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Consertar extends Pericia {
	public static final String nome = "Consertar";
	public static final String desc = "Consertar é a habilidade de reparar engenhocas, " + 
			"veículos, armas e outras máquinas. Personagens " + 
			"sofrem uma penalidade de -2 nas suas rolagens " + 
			"se não tiverem acesso a ferramentas básicas. Uma " + 
			"ampliação em uma rolagem de Consertar reduz " + 
			"à metade o tempo exigido por uma tarefa em " + 
			"particular.";
	
	public Consertar() {
		super(nome, desc, Atributo.ASTUCIA);
	}
	
	public Consertar(int nivelDado) {
		super(nome, desc, Atributo.ASTUCIA, nivelDado);
	}
}
