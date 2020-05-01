package requisito;

import core.Vantagem;

public class RequisitoVantagem extends Requisito {
	Vantagem vantagem;
	
	public RequisitoVantagem(Vantagem vantagem) {
		this.vantagem = vantagem;
	}
	
	@Override
	public CompararRequisito corresponde(Requisito outro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequisitoVantagem other = (RequisitoVantagem) obj;
		if (vantagem == null) {
			if (other.vantagem != null)
				return false;
		} else if (!vantagem.equals(other.vantagem))
			return false;
		return true;
	}

	@Override
	public Object getRequisito() {
		return vantagem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vantagem == null) ? 0 : vantagem.hashCode());
		return result;
	}

}
