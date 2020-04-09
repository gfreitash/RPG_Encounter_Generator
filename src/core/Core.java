package core;

public abstract class Core implements Comparable<Core>{

	private String nome;
	private String desc;
	
	protected Core(String nome, String desc) {
		this.nome = nome;
		this.desc = desc;
	}
	
	public Core() {
	}

	public String getNome() {
		return nome;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int compareTo(Core c) {
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
		if (!(obj instanceof Core))
			return false;
		Core other = (Core) obj;
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
