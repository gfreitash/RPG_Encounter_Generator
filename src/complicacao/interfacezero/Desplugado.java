package complicacao.interfacezero;

import core.Complicacao;

public class Desplugado extends Complicacao {
	public static final String name = "Desplugado";
	public static final String desc = "Você não tem um TAP e é incapaz de ver "
			+ "ou interagir com Hiper-Realidade ou realidade virtual "
			+ "de qualquer modo; incluindo, mas não limitado a, "
			+ "telas digitais, banco instantâneo e TAPPlicativos. Você "
			+ "também não pode ter a perícia Hacking, uma vez que não "
			+ "pode acessar os dados de maneira apropriada. Você pode "
			+ "remover esta Compli-cação gastando um Progresso e "
			+ "comprando um TAP por 5,000 créditos. Uma vez que tenha "
			+ "instalado um TAP, você poderá ter a perícia Hacking.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Desplugado() {
		super();
	}

	public Desplugado(String tipo) {
		super(tipo);
	}
}
