package core;

import utils.Utils;

public enum Classe {
	FRANCO_ATIRADOR(
			new Preferencia<Atributo>()	.adicionar(Atributo.AGILIDADE, Atributo.size())
										.adicionar(Atributo.ASTUCIA, Atributo.size() - 2)
										.adicionar(Atributo.FORCA, Atributo.size() - 3)
										.adicionar(Atributo.values(), Atributo.size() - 4),

			new Preferencia<Pericia>()	.adicionar(Pericia.ATIRAR, Pericia.size() - 1)
										.adicionar(Pericia.FURTIVIDADE, Pericia.size() - 2)
										.adicionar(Pericia.PERCEBER, Pericia.size() - 3)
										.adicionar(Pericia.RASTREAR, Pericia.size() - 4)
										.adicionar(Pericia.LUTAR, Pericia.size() - 5)
										.adicionar( Pericia.values(), Pericia.size() - 6),

			new Preferencia<Vantagem>() .adicionar(Vantagem.values(), Utils.enumLength(Vantagem.class)),

			new Preferencia<TipoRaca>()	.adicionar(TipoRaca.HIBRIDO_DURAO, 1)
										.adicionar(TipoRaca.HIBRIDO_AQUATICO, 1)
										.adicionar(TipoRaca.HIBRIDO_FEROZ, 1)
										.adicionar(TipoRaca.SIMULACRO_LUXO, 1)
										.adicionar(TipoRaca.SIMULACRO_TRABALHADOR, 1)
										.adicionar(TipoRaca.values(), Utils.enumLength(TipoRaca.class) * 5),

			new Preferencia<Complicacao>()	.adicionar(Complicacao.values(), Utils.enumLength(Complicacao.class))
	);

	private Preferencia<Atributo> atributoPreferencia;
	private Preferencia<Pericia> periciaPreferencia;
	private Preferencia<Vantagem> vantagemPreferencia;
	private Preferencia<TipoRaca> racaPreferencia;
	private Preferencia<Complicacao> complicacaoPreferencia;

	Classe(Preferencia<Atributo> atributo, Preferencia<Pericia> pericia, Preferencia<Vantagem> vantagem,
		   Preferencia<TipoRaca> raca, Preferencia<Complicacao> complicacao) {
		atributoPreferencia = atributo;
		periciaPreferencia = pericia;
		vantagemPreferencia = vantagem;
		racaPreferencia = raca;
		complicacaoPreferencia = complicacao;
	}

	public Preferencia<Atributo> getAtributoPreferencia() {
		return atributoPreferencia;
	}

	public Preferencia<Pericia> getPericiaPreferencia() {
		return periciaPreferencia;
	}

	public Preferencia<Vantagem> getVantagemPreferencia() {
		return vantagemPreferencia;
	}

	public Preferencia<TipoRaca> getRacaPreferencia() {
		return racaPreferencia;
	}

	public Preferencia<Complicacao> getComplicacaoPreferencia() {
		return complicacaoPreferencia;
	}
}
