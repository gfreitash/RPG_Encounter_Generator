package complicacao.savageworlds;

import core.Complicacao;

public class DeficienteAuditivo extends Complicacao {
	public DeficienteAuditivo(String tipo) {
		super("Deficiente Auditivo", "Personagens que perderam parte ou toda a " + 
				"sua audição têm esta desvantagem. Como uma " + 
				"Complicação Menor, ela subtrai 2 de todas as " + 
				"rolagens de Perceber feitas para ouvir, incluindo " + 
				"acordar devido a ruídos altos. Uma Complicação " + 
				"maior significa que o personagem é surdo. Ele não " + 
				"pode ouvir e falha automaticamente em todas as " + 
				"rolagens de Perceber dependentes da audição.\n\n" +
				"No mundo de Interface Zero 2.0, a medicina avançou ao " + 
				"ponto em que a Complicação listada " + 
				"acima pode ser removida com um simples procedimento " + 
				"médico. Por causa disso, qualquer personagem que assuma " + 
				"essas Complicações na criação de personagem, e então " + 
				"usa Aprimoramentos em jogo para removê-las, também " + 
				"deve gastar um Progresso. Aqueles que assumem essas " + 
				"Complicações na criação de personagem não podem anular " + 
				"os seus efeitos com Aprimoramentos durante a criação de " + 
				"personagem.", tipo, "Menor", "Maior");
	}
}
