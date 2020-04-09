package complicacao.interfacezero;

import core.Complicacao;

public class ForaRede extends Complicacao {
	public static final String nome = "Fora da Rede";
	public static final String desc = "De um jeito ou de outro, este personagem conseguiu " + 
			"permanecer ou se tornou não registrado. Talvez o seu nascimento " + 
			"por alguma razão nunca tenha sido registrado; talvez " + 
			"ele (ou outra pessoa) apagou todos os seus registros oficiais. " + 
			"Qualquer que seja o caso, até onde o resto do mundo sabe, " + 
			"ele não existe. O lado bom é, isso torna o personagem realmente" + 
			"difícil de ser rastreado; o lado ruim é que também " + 
			"é impossível fazer qualquer coisa legalmente — como " + 
			"comprar um carro, abrir uma conta bancária, ou arrumar " + 
			"um emprego normal. Ele também é um alvo primário para " + 
			"corporações procurando uma cobaia que ninguém dará por " + 
			"falta, caso desapareça. O Mestre tem a palavra final, mas a " + 
			"regra geralmente aceita é que qualquer coisa requerendo " + 
			"uma identidade ou que não pode ser realizada com uma " + 
			"transação em dinheiro, basicamente não pode ser feita. " + 
			"Se um personagem tem a Vantagem Identidade Alternativa, " + 
			"ele pode usar sua outra identidade para realizar essas " + 
			"coisas. Mas, se a identidade do personagem for revelada " + 
			"como falsa, seus recursos serão congelados no banco, ele " + 
			"pode ser demitido do seu trabalho e até preso, dependendo " + 
			"das circunstâncias. Em outras palavras, ele volta a estaca " + 
			"zero, se não pior.";
	
	public ForaRede(String tipo) {
		super(tipo, "Maior");
	}
}
