package requisito;

import core.NPC;
import core.Progresso;
import core.Requisito;

public class RequisitoProgresso implements Requisito {
		Progresso progresso;

	public RequisitoProgresso(Progresso progresso) {
		this.progresso = progresso;
	}

	@Override
	public Object getRequisito() {
		return progresso;
	}

	@Override
	public boolean check(NPC npc) {
		return progresso.check(npc);
	}
}
