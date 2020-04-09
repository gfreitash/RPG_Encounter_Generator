package vantagem.interfacezero;

import complicacao.savageworlds.Voto;
import core.Progresso;
import requisito.RequisitoComplicacao;
import requisito.RequisitoProgresso;
import vantagem.savageworlds.VantagemAntecedente;

public class Rico extends VantagemAntecedente {
	public static final String nome = "Rico";
	public static final String desc = "Personagens Ricos triplicam seus fundos iniciais e ganham "
			+ "um bônus de 12,500 créditos em cada Progresso. Contudo, o dinheiro sempre vêm "
			+ "com uma obrigação. Eles podem ganhar dinheiro de um patrocínio corporativo, "
			+ "um fundo trust ou mesmo um negócio que o personagem tem e administra. "
			+ "Exemplos de personagens ricos no gênero são Sylvia Stingray de Bubblegum "
			+ "Crisis e logan Cale de Dark Angel; ambos tinham obrigações (administrando "
			+ "um negócio, ser legal com a família) que eles cumprem a fim de manter "
			+ "seu dinheiro. Esta é uma Complicação Voto (Menor) que você deve "
			+ "discutir com o seu Mestre — falhar em cumprir o Voto "
			+ "significa que o personagem não recebe seus créditos extras até "
			+ "que ele cuide dessas obrigações. Se o personagem perder completamente"
			+ " os benefícios da Vantagem, ele pode, a critério do Mestre, substituir"
			+ " a Vantagem com outra coisa.";
	
	public Rico() {
		super(new RequisitoProgresso(new Progresso(0)), new RequisitoComplicacao(new Voto("")));
	}
}
