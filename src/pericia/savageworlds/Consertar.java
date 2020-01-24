package pericia.savageworlds;

import core.Pericia;

public class Consertar extends Pericia {
	private static String desc = "Consertar é a habilidade de reparar engenhocas, " + 
			"veículos, armas e outras máquinas. Personagens " + 
			"sofrem uma penalidade de -2 nas suas rolagens " + 
			"se não tiverem acesso a ferramentas básicas. Uma " + 
			"ampliação em uma rolagem de Consertar reduz " + 
			"à metade o tempo exigido por uma tarefa em " + 
			"particular.";
	
	public Consertar() {
		super("Consertar", desc, new atributo.Astucia());
	}
	
	public Consertar(int nivelDado) {
		super("Consertar", desc, new atributo.Astucia(), nivelDado);
	}
}
