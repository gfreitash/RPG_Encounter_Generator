package core;

public enum Classe {
	FRANCO_ATIRADOR(
			new Preferencia<Atributo>()	.adicionar(Atributo.AGILIDADE, Util.lengthOf(Atributo.class) - 1)
										.adicionar(Atributo.ASTUCIA, Util.lengthOf(Atributo.class) - 2)
										.adicionar(Atributo.FORCA, Util.lengthOf(Atributo.class) - 3)
										.adicionar(Atributo.values(), Util.lengthOf(Atributo.class) - 4),

			new Preferencia<Pericia>()	.adicionar(Pericia.ATIRAR, Util.lengthOf(Pericia.class) - 1)
										.adicionar(Pericia.FURTIVIDADE, Util.lengthOf(Pericia.class) - 2)
										.adicionar(Pericia.PERCEBER, Util.lengthOf(Pericia.class) - 3)
										.adicionar(Pericia.RASTREAR, Util.lengthOf(Pericia.class) - 4)
										.adicionar(Pericia.LUTAR, Util.lengthOf(Pericia.class) - 5)
										.adicionar(Pericia.values(), Util.lengthOf(Pericia.class) - 6),

			new Preferencia<Vantagem>() .adicionar(Vantagem.values(), Util.lengthOf(Vantagem.class)),

			new Preferencia<TipoRaca>()	.adicionar(TipoRaca.HIBRIDO_DURAO, 1)
										.adicionar(TipoRaca.HIBRIDO_AQUATICO, 1)
										.adicionar(TipoRaca.HIBRIDO_FEROZ, 1)
										.adicionar(TipoRaca.SIMULACRO_LUXO, 1)
										.adicionar(TipoRaca.SIMULACRO_TRABALHADOR, 1)
										.adicionar(TipoRaca.values(), Util.lengthOf(TipoRaca.class) * 5),

			new Preferencia<Complicacao>()	.adicionar(Complicacao.values(), Util.lengthOf(Complicacao.class))
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
