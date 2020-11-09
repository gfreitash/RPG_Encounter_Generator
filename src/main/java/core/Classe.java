package core;

import utils.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Classe {
	FRANCO_ATIRADOR(
			new Preferencia<Atributo>()	.adicionar(Atributo.AGILIDADE, Atributo.getSize(Atributo.class))
										.adicionar(Atributo.ASTUCIA,
												Atributo.getSize(Atributo.class) - 2)
										.adicionar(Atributo.FORCA,
												Atributo.getSize(Atributo.class)- 3)
										.adicionar(Atributo.values(Atributo.class),
												Atributo.getSize(Atributo.class) - 4),

			new Preferencia<Pericia>()	.adicionar(Pericia.ATIRAR, Pericia.getSize(Pericia.class) - 1)
										.adicionar(Pericia.FURTIVIDADE, Pericia.getSize(Pericia.class) - 2)
										.adicionar(Pericia.PERCEBER, Pericia.getSize(Pericia.class) - 3)
										.adicionar(Pericia.RASTREAR, Pericia.getSize(Pericia.class) - 4)
										.adicionar(Pericia.LUTAR, Pericia.getSize(Pericia.class) - 5)
										.adicionar(Pericia.values(Pericia.class),
												Pericia.getSize(Pericia.class) - 6)
			,

			new Preferencia<Vantagem>() .adicionar(Vantagem.values(), Utils.enumLength(Vantagem.class)),

			new Preferencia<TipoRaca>()	.adicionar(TipoRaca.HIBRIDO_DURAO, 1)
										.adicionar(TipoRaca.HIBRIDO_AQUATICO, 1)
										.adicionar(TipoRaca.HIBRIDO_FEROZ, 1)
										.adicionar(TipoRaca.SIMULACRO_LUXO, 1)
										.adicionar(TipoRaca.SIMULACRO_TRABALHADOR, 1)
										.adicionar(TipoRaca.values(), Utils.enumLength(TipoRaca.class) * 5),

			new Preferencia<Complicacao>()	.adicionar(Complicacao.values(), Utils.enumLength(Complicacao.class))
	);

	private final ArrayList<Preferencia<?>> preferencias;

	Classe(Preferencia<?> ... preferencias){
		this.preferencias = new ArrayList<>();
		Collections.addAll(this.preferencias, preferencias);
	}

	public List<Preferencia<?>> getPreferencias() {
		return preferencias;
	}

}
