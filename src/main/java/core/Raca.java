package core;

import java.util.Objects;

public abstract class Raca implements PossuiEfeito{
	private final Identidade id;

	public Raca(String nome, String descricao) {
		id = new Identidade(nome, descricao);
	}

	public Identidade getId() {
		return id;
	}

	public boolean check(NPC npc) {
		return npc.getRaca().equals(this);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Raca)) return false;
		Raca raca = (Raca) o;
		return getId().equals(raca.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
}
