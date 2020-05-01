package pericia.interfacezero;

import pericia.savageworlds.Conhecimento;

public class ConhecimentoDemolicao extends Conhecimento {
	public static final String especializacao = "Demolição";
	public static final String nome = "Conhecimento (Demolição)";
	public static final String desc = "Uso bem sucedido de " + 
			"demolições pode significar a diferença entre destruição " + 
			"do alvo como planejado e perda indesejada de vidas e " + 
			"propriedade. A perícia também permite que o personagem " + 
			"tenha um entendimento de qual é o melhor tipo " + 
			"de explosivo e quanto será preciso para remover o obstáculo. " + 
			"Além disso, uma ampliação no resultado permitirá " + 
			"saber a distância exata que é preciso estar da explosão, " + 
			"baseada no tamanho da carga, a contenção e o dano criado. " + 
			"Esta perícia é usada toda vez que um personagem quiser " + 
			"colocar junto uma bolsa de cargas ou acionar explosivos " + 
			"Uma falha crítica resultará em detonação imediata. Uma " + 
			"falha simples resultará em detonação prematura ou em " + 
			"nenhuma detonação.";
	
	public ConhecimentoDemolicao() {
		super(nome, desc, especializacao);
	}
}
