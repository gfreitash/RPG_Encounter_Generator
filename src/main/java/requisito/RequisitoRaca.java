package requisito;

import core.Checavel;
import core.NPC;
import core.Raca;
import core.Requisito;

public class RequisitoRaca implements Requisito {
	private final Raca raca;

	public RequisitoRaca(Raca raca) {
		this.raca = raca;
	}

	public Object getRequisito() {
		return raca;
	}

	@Override
	public boolean check(NPC npc) {
		return raca.check(npc);
	}
}
