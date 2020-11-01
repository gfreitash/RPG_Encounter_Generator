package requisito;

import core.Atributo;
import core.NPC;
import core.Requisito;

public class RequisitoAtributo implements Requisito {
	private final Atributo atributo;

	public RequisitoAtributo(Atributo atributo, int nivelDado) {
		this.atributo = atributo;
		this.atributo.setNivelDado(nivelDado);
	}

	public boolean check(NPC npc) {
		return atributo.check(npc);
	}

	@Override
	public Object getRequisito() {
		return atributo;
	}
}
