package requisito;

import core.Progresso;

public class RequisitoProgresso extends Requisito {
		Progresso progresso;

	public RequisitoProgresso(Progresso progresso) {
		this.progresso = progresso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((progresso == null) ? 0 : progresso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof RequisitoProgresso))
			return false;
		RequisitoProgresso other = (RequisitoProgresso) obj;
		if (progresso == null) {
			if (other.progresso != null)
				return false;
		} else if (!progresso.equals(other.progresso))
			return false;
		return true;
	}

	@Override
	public Object getRequisito() {
		return progresso;
	}

}
