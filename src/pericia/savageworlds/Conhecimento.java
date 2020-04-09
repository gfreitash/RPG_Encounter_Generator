package pericia.savageworlds;

import atributo.Astucia;
import core.Pericia;

public class Conhecimento extends Pericia {
	@SuppressWarnings("unused")
	//Due to name here only being known on instantiation it needs to be non-static and non-final
	private String nome;
	public static final String desc = "Conhecimento é uma perícia abrangente " + 
			"que deve possuir algum tipo de foco, como " + 
			"Conhecimento (Ocultismo) ou Conhecimento " + 
			"(Ciência). O jogador pode escolher o foco do " + 
			"Conhecimento do seu personagem, devendo " + 
			"refletir seu histórico e instrução. Um arqueólogo, " + 
			"por exemplo, deveria ter Conhecimento (História) " + 
			"e Conhecimento (Arqueologia). " + 
			"Focos gerais como Ciência são aceitáveis, mas o " + 
			"Mestre deve dar um bônus a um personagem cujo " + 
			"foco escolhido seja mais relevante a uma tarefa em " + 
			"particular, como usar um Conhecimento (Biologia) " + 
			"para identificar uma planta ou animal. " + 
			"Alguns focos de Conhecimento são: Área, " + 
			"Batalha (usado em Combate em Massa, veja a " + 
			"página 109), Computadores, Eletrônica, História, " + 
			"Jornalismo, vários idiomas, Lei, Medicina (embora " + 
			"cuidar de alguém exija a perícia Curar) ou Ciência.";
	
	public Conhecimento(String especializacao) {
		super(new Astucia(), especializacao);
		nome = "Conhecimento (" + especializacao + ")";
	}
	
	public Conhecimento(String especializacao, int nivelDado) {
		super(new Astucia(), nivelDado, especializacao);
		nome = "Conhecimento (" + especializacao + ")";
	}
	
}
