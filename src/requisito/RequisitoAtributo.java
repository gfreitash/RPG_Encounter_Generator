package requisito;

import core.Atributo;

public class RequisitoAtributo extends Requisito {
	private Atributo atributo;

	public RequisitoAtributo(Atributo atributo, int nivelDado) {
		this.atributo = atributo;
		this.atributo.setNivelDado(nivelDado);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atributo == null) ? 0 : atributo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof RequisitoAtributo))
			return false;
		RequisitoAtributo other = (RequisitoAtributo) obj;
		if (atributo == null) {
			if (other.atributo != null)
				return false;
		} else if (!atributo.equals(other.atributo))
			return false;
		return true;
	}

	@Override
	public Atributo getRequisito() {
		return atributo;
	}

	/*@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o instanceof RequisitoAtributo) {
			RequisitoAtributo reqAtrib = (RequisitoAtributo) o;
			return atributo.equals(reqAtrib.atributo);
		}
		return false;
	}*/
	

}
