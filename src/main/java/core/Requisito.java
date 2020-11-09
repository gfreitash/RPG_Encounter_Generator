package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Requisito implements Requisitavel {
	private final List<Requisitavel> requisitos;

	public Requisito(Requisitavel ... requisitos) {
		this.requisitos = new ArrayList<>();
		Collections.addAll(this.requisitos, requisitos);
	}

	public List<Requisitavel> getRequisitos() {
		return requisitos;
	}

	@Override
	public boolean check(NPC npc) {
		boolean possui;
		for(Requisitavel r: requisitos) {
			possui = r.check(npc);

			if(!possui)
				return false;
		}
		return true;
	}
}
