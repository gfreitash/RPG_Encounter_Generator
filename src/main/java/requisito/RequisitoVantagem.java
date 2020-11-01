package requisito;

import core.NPC;
import core.Requisito;
import core.Vantagem;

public class RequisitoVantagem implements Requisito {
	private final Vantagem vantagem;
	
	public RequisitoVantagem(Vantagem vantagem) {
		this.vantagem = vantagem;
	}

	@Override
	public Object getRequisito() {
		return vantagem;
	}

	@Override
	public boolean check(NPC npc) {
		return vantagem.check(npc);
	}
}
