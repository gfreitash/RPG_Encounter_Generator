package requisito;

import core.NPC;
import core.Pericia;
import core.Requisito;

public class RequisitoPericia implements Requisito {
	private final Pericia pericia;
	
	public RequisitoPericia(Pericia pericia) {
		this.pericia = pericia;
	}

	public RequisitoPericia(Pericia pericia, int nivelPericia) {
		this.pericia = pericia;
		this.pericia.setNivelDado(nivelPericia);
	}

	public Object getRequisito() {
		return pericia;
	}

	@Override
	public boolean check(NPC npc) {
		return pericia.check(npc);
	}
}
