package core;

public abstract class Atributo extends Core {

	private int modDado;
	private int nivelDado;
	
	public Atributo() {
		setNivelDado(4);
	}

	public int getNivelDado() {
		return nivelDado;
	}

	public int getModDado() {
		return modDado;
	}

	public void setNivelDado(int nivel) throws IllegalArgumentException {
		if ((nivel % 2) == 0 && nivel >= 4)
			if (nivel <= 12)
				nivelDado = nivel;
			else {
				nivelDado = 12;
				modDado = (nivel - nivelDado) / 2;
			}
		else
			throw new IllegalArgumentException("\"nivel\" deve ser par e maior ou igual a 4");
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + modDado;
		result = prime * result + nivelDado;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Atributo))
			return false;
		Atributo other = (Atributo) obj;
		if (modDado != other.modDado)
			return false;
		if (nivelDado != other.nivelDado)
			return false;
		return true;
	}

}
