package complicacao.interfacezero;

import core.Complicacao;

public class UmBracoSo extends Complicacao {
	public UmBracoSo(String tipo) {
		super("Um Braço Só", "Seja de nascimento ou devido a uma batalha, " + 
				"seu herói perdeu um braço. Por sorte, o seu " + 
				"outro é (agora) o braço “bom”. Tarefas que " + 
				"requerem duas mãos, como Escalar, sofrem -4 de " + 
				"penalidade.\n\n" + "No mundo de Interface Zero 2.0, a medicina avançou ao " + 
				"ponto em que a Complicação listada " + 
				"acima pode ser removida com um simples procedimento " + 
				"médico. Por causa disso, qualquer personagem que assuma " + 
				"essas Complicações na criação de personagem, e então " + 
				"usa Aprimoramentos em jogo para removê-las, também " + 
				"deve gastar um Progresso. Aqueles que assumem essas " + 
				"Complicações na criação de personagem não podem anular " + 
				"os seus efeitos com Aprimoramentos durante a criação de " + 
				"personagem.", tipo, "Maior");
	}
}
