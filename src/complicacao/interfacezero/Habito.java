package complicacao.interfacezero;

import core.Complicacao;

public class Habito extends Complicacao {
	public Habito(String tipo) {
		super("Hábito", "Seu guerreiro possui um hábito irritante e " + 
				"constante de algum tipo. Talvez ele cutuque seu " + 
				"nariz, diga “cê sabe” em cada frase ou masque " + 
				"chiclete como se isso transbordasse estilo. " + 
				"Um Hábito menor irrita aqueles a seu redor, " + 
				"mas não é perigoso. Seu herói sofre -1 no Carisma. " + 
				"Um Hábito maior é uma dependência física " + 
				"ou mental de alguma espécie, debilitante ou " + 
				"mesmo possivelmente mortal. Isso inclui o uso " + 
				"de drogas, alcoolismo ou talvez até mesmo um " + 
				"vício em realidade virtual num cenário de alta " + 
				"tecnologia. Um personagem que não receba " + 
				"sua dose precisa fazer um teste de Fadiga a " + 
				"cada 24 horas seguintes. A primeira rolagem cujo resultado seja " + 
				"uma falha faz o personagem ficar Fatigado, " +
				"depois Exausto. O resultado final é um coma " + 
				"por uso de drogas pesadas ou um caso grave " + 
				"de choque em dependências como a de álcool " + 
				"ou Realidade Virtual. Tratamento médico pode " + 
				"amenizar os sintomas. Caso contrário, a vítima " + 
				"precisará viver com as penalidades por 1d6 " + 
				"dias. Posteriormente, o herói tem de pagar pela " + 
				"Complicação sacrificando uma oportunidade de " + 
				"Progresso ou eventualmente cairá de volta em " + 
				"seu vício.", tipo, "Menor", "Maior");
	}
}
