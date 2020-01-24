package complicacao.interfacezero;

import core.Complicacao;

public class FiltrosRuins extends Complicacao {
	public FiltrosRuins(String tipo) {
		super("Filtros Ruins", "Seus filtros de spam têm glitches. Você "
				+ "está sendo con-stantemente bombardeado por spam, "
				+ "vírus e outros malwares. Este bombardeio constante "
				+ "torna mais provável que eventualmente algo ruim penetre "
				+ "no seu firewall. Con-sequentemente, seu firewall é "
				+ "reduzido em 1 com a versão Menor desta complicação, ou "
				+ "em 2 para a versão Maior.", tipo, "Menor", "Maior");
	}
}
