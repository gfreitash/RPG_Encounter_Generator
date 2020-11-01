package core;

public class Identidade implements Comparable<Identidade>{

	private final String nome;
	private final String descricao;
	
	public Identidade(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int compareTo(Identidade c) {
		return this.getNome().compareTo(c.getNome());
	}

	@Override
	public String toString() {
		return nome + " -> " + descricao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
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
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (nome == null) {
			return other.nome == null;
		} else return nome.equals(other.nome);
	}
	
}
