package complicacao.savageworlds;

import core.Complicacao;

public class Pacifista extends Complicacao {
	public Pacifista(String tipo) {
		super("Pacifista", "Seu herói despreza absolutamente a violência. " + 
				"Pacifismo Menor significa que ele luta apenas " + 
				"se não for dada nenhuma outra opção e jamais " + 
				"permite a matança de prisioneiros e outras " + 
				"vítimas indefesas. " + 
				"Pacifistas Maiores não irão combater criaturas " + 
				"vivas sob quaisquer circunstâncias. Eles podem " + 
				"se defender, mas não farão nada para ferir " + 
				"permanentemente criaturas vivas sencientes. " + 
				"Criaturas inegavelmente malignas, mortos vivos, " + 
				"demônios e similares não contam e podem ser " + 
				"atacadas ou mesmo feridos. Um Pacifista Maior " + 
				"também pode lutar com métodos não letais, como " + 
				"os seus próprios punhos. Tais personagens, no " + 
				"entanto, só o farão se obviamente ameaçados.", tipo, "Menor", "Maior");
	}
}
