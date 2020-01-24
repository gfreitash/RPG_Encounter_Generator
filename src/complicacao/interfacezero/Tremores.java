package complicacao.interfacezero;

import core.Complicacao;

public class Tremores extends Complicacao {
	public Tremores(String tipo) {
		super("Tremores", "Por alguma razão, este personagem tem alguns fios soltos " + 
				"no cérebro. Seja por uma defeito de nascença ou porque " + 
				"doutores prestativos de algum projeto de pesquisa fizeram " + 
				"um caminho neural em zig onde deveriam ter feito um zag, " + 
				"o resultado é o mesmo: ele sofre tremores se está sobrecarregado " + 
				"por estresse. Sempre que esse personagem é " + 
				"forçado a fazer um teste de Espírito e falha, ele deve fazer " + 
				"imediatamente um teste de Vigor no qual se também falhar, " + 
				"ele começa a ter uma convulsão. " + 
				"A convulsão faz com que o personagem caia e sofra uma " + 
				"penalidade de -2 em todos os testes até que ela passe. " + 
				"Além disso, o personagem só pode realizar Movimentação " + 
				"3 nesse período. A convulsão dura 15 turnos menos um " + 
				"número de turnos igual ao Espírito do personagem. " + 
				"A boa noticia é que sempre há alguma forma de tratamento " + 
				"químico para compensar possíveis convulsões. Contanto que " + 
				"Criação de Personagens " + 
				"o personagem tenha acesso a sua medicação, ele não tem que "
				+ "fazer um teste de Vigor quando falha em um teste de Espírito, "
				+ "mas isso requer gasto de dinheiro — 500 créditos adicionais por "
				+ "sessão de jogo. O personagem pode gastar menos (metade) em "
				+ "fontes naturais alternativas, mais baratas, porém invariavelmente "
				+ "menos eficientes. O personagem ainda deve fazer seu teste de Vigor "
				+ "em falhas em teste de Espírito, mas ele ganha um bônus de +1.",
				tipo, "Menor");
	}
}
