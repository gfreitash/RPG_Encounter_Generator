package core;

import complicacao.interfacezero.*;
import complicacao.savageworlds.*;

public enum Complicacoes {
	ANEMICO(new Anemico()), ARROGANTE(new Arrogante());
	
	
	Complicacao complicacao;
	
	Complicacoes(Complicacao complicacao) {
		this.complicacao = complicacao;
	}
}
