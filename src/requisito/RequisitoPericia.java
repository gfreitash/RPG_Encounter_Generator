package requisito;

import core.Pericia;

public class RequisitoPericia extends Requisito{
	private Pericia pericia;
	
	public RequisitoPericia(Pericia pericia) {
		this.pericia = pericia;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequisitoPericia other = (RequisitoPericia) obj;
		if (pericia == null) {
			if (other.pericia != null)
				return false;
		} else if (!pericia.equals(other.pericia))
			return false;
		return true;
	}

	@Override
	public Object getRequisito() {
		return pericia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pericia == null) ? 0 : pericia.hashCode());
		return result;
	}
}
