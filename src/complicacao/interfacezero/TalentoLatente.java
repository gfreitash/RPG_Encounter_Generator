package complicacao.interfacezero;

import core.Complicacao;

public class TalentoLatente extends Complicacao {
	public static final String nome = "Talento Latente";
	public static final String desc = "Alguns zeeks desafortunados sequer se dão conta de que "
			+ "eles são zeeks até que coisas estranhas começam a acontecer a sua volta. "
			+ "Nesse ponto, ou eles aprendem a controlar, ou aprendem a conviver. "
			+ "Esta Complicação funciona como a versão Maior da Complicação "
			+ "Gatilho por Estresse (veja abaixo) com algumas grandes diferenças. "
			+ "A má noticia é que o seu personagem não tem ideia de quais são os "
			+ "seus poderes latentes, então o Mestre escolhe qual (ou quais) se "
			+ "manifestam quando o Gatilho por Estresse " + 
			"se aciona — até três deles, como qualquer outro zeek. Ele " + 
			"pode escolher qualquer poder, entretanto o personagem " + 
			"deve ter o Estágio suficiente para usá-lo. Quando você testa " + 
			"para verificar se o poder se ativa, é feito um teste de Espírito " + 
			"(ao invés de um teste da perícia Psiônicos). Se você quiser " + 
			"gastar um Bene para impedir o poder de se manifestar, " + 
			"deve declarar antes que o Mestre diga qual é o seu poder. " + 
			"A boa notícia é, você pode pagar por esta Complicação " + 
			"gastando dois Progressos. Após o primeiro Progresso, esta " + 
			"Complicação é tratada como a versão Menor de Gatilho" + 
			"por Estresse, e os poderes só são ativados por uma falha " + 
			"crítica — embora as regras acima ainda se apliquem. Após o " + 
			"segundo Progresso, seu personagem pode adquirir o Antecedente " + 
			"Arcano (Psiônicos) e não sofre mais de Gatilho por " + 
			"Estresse. Os poderes iniciais do seu personagem devem ser " + 
			"qualquer poder manifestado por causa do Talento latente. " + 
			"Se todos os três ainda não tiverem sido designados, você " + 
			"pode escolher qualquer poder remanescente.";
	
	public TalentoLatente(String tipo) {
		super(tipo, "Maior");
	}

}

