package core;

public abstract class Pericia extends Core{
	
	private Atributo tipoAtributo;
	private int nivelPericia;
	private int modificador;
	private int modNivelPericia;
	private String especializacao = "";
	
	protected Pericia(Atributo atrib){
		tipoAtributo = atrib;
		setNivelPericia(4);
	}
	
	protected Pericia(Atributo atrib, int nivelPericia){
		tipoAtributo = atrib;
		setNivelPericia(nivelPericia);
	}
	
	protected Pericia(Atributo atrib, String especializacao){
		tipoAtributo = atrib;
		this.especializacao = especializacao;
		nivelPericia = 4;
	}
	
	protected Pericia(Atributo atrib, int nivelPericia, String especializacao){
		tipoAtributo = atrib;
		this.especializacao = especializacao;
		setNivelPericia(nivelPericia);
	}
	
	public Atributo getTipoAtributo() {
		return tipoAtributo;
	}
	
	public String getEspecializacao() {
		return especializacao;
	}
	
	public int getNivelPericia() {
		return nivelPericia;
	}
	
	public int getModificador() {
		return modificador;
	}
	
	public int getModNivelPericia() {
		return modNivelPericia;
	}
	
	public void setModificador(int mod) throws IllegalArgumentException {
		if(mod >= 0)
			modificador = mod;
		else throw new IllegalArgumentException("\"mod\" deve ser positivo");
	}
	
	public void setNivelPericia(int nivel) throws IllegalArgumentException {
		if ((nivel % 2) == 0 && nivel >= 4)
			if (nivel <= 12)
				nivelPericia = nivel;
			else {
				nivelPericia = 12;
				modNivelPericia = (nivel - nivelPericia) / 2;
			}
		else
			throw new IllegalArgumentException("\"nivel\" deve ser par e maior ou igual a 4");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((especializacao == null) ? 0 : especializacao.hashCode());
		result = prime * result + modNivelPericia;
		result = prime * result + modificador;
		result = prime * result + nivelPericia;
		result = prime * result + ((tipoAtributo == null) ? 0 : tipoAtributo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Pericia))
			return false;
		Pericia other = (Pericia) obj;
		if (especializacao == null) {
			if (other.especializacao != null)
				return false;
		} else if (!especializacao.equals(other.especializacao))
			return false;
		if (modNivelPericia != other.modNivelPericia)
			return false;
		if (modificador != other.modificador)
			return false;
		if (nivelPericia != other.nivelPericia)
			return false;
		if (tipoAtributo == null) {
			if (other.tipoAtributo != null)
				return false;
		} else if (!tipoAtributo.equals(other.tipoAtributo))
			return false;
		return true;
	}
}
	

