package complicacao.interfacezero;

import core.Complicacao;

public class Divida extends Complicacao {
	public static final String nome = "Dívida";
	public static final String desc = "Algumàs vezes, um personagem quer começar com "
			+ "aquele “algo” a mais além de cibernéticos, mas não "
			+ "tem os créditos para fazer acontecer. Mas ei, bro... "
			+ "isso é 2090, e se você está disposto a vender a sua "
			+ "alma para uma corporação ou gangue, sempre pode pegar "
			+ "um empréstimo, né? Se você é um entregador de pizzas "
			+ "e quer ter aquele veículo para poder trabalhar, por exemplo, "
			+ "apenas se dirija ao Honest Rex e experimente o seu programa "
			+ "de primeira compra. Como uma Complicação Menor, o personagem "
			+ "pode fazer uma única compra de até 15,000 créditos, mas tem "
			+ "que acrescentar 500 créditos ao seu custo de vida. Caso ele "
			+ "falhe em realizar o seu pagamento, deve fazê-lo na próxima "
			+ "sessão pagando o dobro. Se ele falhar em pagar por duas sessões "
			+ "consecutivas, o personagem adquire o equivalente a Complicação "
			+ "Procurado à medida que cobradores (ou capangas do Rex) o "
			+ "assediam continuamente por dinheiro. Caso o personagem continue "
			+ "a faltar com seus pagamentos, no mínimo sua compra será "
			+ "recuperada — no pior dos casos, ele se encontrará no lado errado "
			+ "de um tipo diferente de contrato.A versão Maior desta Complicação "
			+ "funciona quase igual, exceto que o personagem pode fazer uma "
			+ "única compra de até 30,000 créditos e tem que acrescentar "
			+ "1,000 créditos ao seu custo de vida. Também é provável que o "
			+ "credor fique mais... infeliz com a falta de pagamentos.";
	
	public Divida(String tipo) {
		super(tipo, "Menor", "Maior");
	}
}
