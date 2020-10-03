package core;

public class Identidade implements Comparable<Identidade>{

	private String nome;
	private String desc;
	
	public Identidade(String nome, String desc) {
		this.nome = nome;
		this.desc = desc;
	}

	public String getNome() {
		return nome;
	}
	
	public String getDesc() {
		return desc;
	}
	
	protected void setNome(String nome) {
		this.nome = nome;
	}
	
	protected void setDesc(String desc) {
		this.desc = desc;
	}
	
	public int compareTo(Identidade c) {
		return this.getNome().compareTo(c.getNome());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Identidade))
			return false;
		Identidade other = (Identidade) obj;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
