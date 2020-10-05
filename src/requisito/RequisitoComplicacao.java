package requisito;

import core.Complicacao;
import core.TipoComplicacao;

public class RequisitoComplicacao extends Requisito {
	private Complicacao complicacao;
	
	public RequisitoComplicacao(Complicacao complicacao) {
		this.complicacao = complicacao;
	}

	public RequisitoComplicacao(Complicacao complicacao, TipoComplicacao tipo) {
		this.complicacao = complicacao;
		this.complicacao.setTipo(tipo);
	}

	@Override
	public Complicacao getRequisito() {
		return complicacao;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequisitoComplicacao other = (RequisitoComplicacao) obj;
		if (complicacao == null) {
			if (other.complicacao != null)
				return false;
		} else if (!complicacao.equals(other.complicacao))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((complicacao == null) ? 0 : complicacao.hashCode());
		return result;
	}

}
