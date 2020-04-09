package requisito;

import core.Complicacao;

public class RequisitoComplicacao extends Requisito {
	Complicacao complicacao;
	
	public RequisitoComplicacao(Complicacao complicacao) {
		this.complicacao = complicacao;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o instanceof RequisitoComplicacao) {
			RequisitoComplicacao reqAtrib = (RequisitoComplicacao) o;
			return complicacao.equals(reqAtrib.complicacao);
		}
		return false;
	}

}
