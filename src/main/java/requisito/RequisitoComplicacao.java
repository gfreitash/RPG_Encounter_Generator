package requisito;


import core.Complicacao;
import core.NPC;
import core.Requisito;
import core.TipoComplicacao;

public class RequisitoComplicacao implements Requisito {
	private final Complicacao complicacao;
	
	public RequisitoComplicacao(Complicacao complicacao) {
		this.complicacao = complicacao;
	}

	public RequisitoComplicacao(Complicacao complicacao, TipoComplicacao tipo) {
		this.complicacao = complicacao;
		this.complicacao.setTipo(tipo);
	}

	public Complicacao getRequisito() {
		return complicacao;
	}

	public boolean check(NPC npc) {
		return complicacao.check(npc);
	}

}
