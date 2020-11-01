package raca.interfacezero;

import core.NPC;
import core.Raca;

public class Ciborgue extends Raca {
	public static final String NOME = "Ciborgue";
	public static final String DESCRICAO = """
			Pouca coisa é mais assustadora em batalha do que um ciborgue. Eles não são muito além de um cérebro orgânico em um corpo de andróide. Ciborgues vem em forma humanóide, simplesmente para facilitar a transição para um novo corpo. A maioria dos ciborgues trabalha para os seus respectivos governos, ou corporações poderosas que podem arcar com o procedimento para pessoal de confiança. Contudo, mais e mais ciborgues estão começando a encontrar o seu caminho até o setor privado.\s
			• Aprimorado: Ciborgues são construídos para serem bestas cibernéticas. Eles começam com um único Aprimoramento Nível das Ruas com uma Tensão de 1.\s
			• Construto: Ciborgues acrescentam +2 para se recuperar de Abalado, não sofrem modificadores de ferimentos e são imunes a venenos e doenças. Ciborgues não podem se curar naturalmente. Curar um ciborgue requer a perícia Consertar — que é usada como a perícia Curar, sem a “Hora de Ouro”.\s
			• Blindagem PEM: Ciborgues tem 2 pontos de Armadura quando atacados por uma arma de PEM.\s
			• Vulnerabilidade a PEM: Ciborgues sofrem dano completo de Armas PEM.\s
			• Liga Metálica: A pele completamente metálica de um ciborgue oferece resistência contra armas de fogo leves. Eles tem +2 de Armadura.\s
			• Forasteiro: A maioria das pessoas sente uma aversão natural por alguém que optou por ter todos os traços de sua humanidade removidos para ser colocado em uma fria máquina de guerra. Eles sofrem uma penalidade de -2 no Carisma quando lidam com não Ciborgues.\s
			• Dieta Especializada: Ciborgues não podem digerir comida normal e requerem comida especial com nutrientes para manterem os seus cérebros saudáveis. Isso aumenta o custo do seu estilo de vida em 1,000 créditos.\s
			• Enfraquecimento Táctil: O corpo do ciborgue não é tão sensível quanto um corpo humano. Ciborgues sofrem uma penalidade de -2 em tarefas em que a manipulação delicada de objetos é importante. Abrir uma fechadura ou realizar uma cirurgia são dois exemplos. Atirar e lutar normalmente não são afetados.""";
	
	public Ciborgue() {
		super(NOME, DESCRICAO);
	}

	@Override
	public void aplicarEfeitos(NPC npc) {

	}
}
