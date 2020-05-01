package core;

import complicacao.interfacezero.*;
import complicacao.savageworlds.*;

public enum Complicacoes {
	ANALFABETO(new Analfabeto()), ANEMICO(new Anemico()), ARROGANTE(new Arrogante()), BOCA_GRANDE(new BocaGrande()),
	CAUTELOSO(new Cauteloso()), CEGO(new Cego()), CODIGO_HONRA(new CodigoHonra()), COVARDE(new Covarde()), 
	CREDITO_RUIM(new CreditoRuim()), CURIOSO(new Curioso()), DEFICICIENTE_AUDITIVO(new DeficienteAuditivo()),
	DELIRANTE(new Delirante()), DESAGRADAVEL(new Desagradavel()), DESASTRADO(new Desastrado()),
	DESEJO_MORRER(new DesejoMorrer()), DESPLUGADO(new Desplugado()), DIVIDA(new Divida()), 
	EXCESSO_CONFIANCA(new ExcessoConfianca()), FEIO(new Feio()), FILTROS_RUINS(new FiltrosRuins()), FOBIA(new Fobia()),
	FORA_REDE(new ForaRede()), FORASTEIRO(new Forasteiro()), GANANCIOSO(new Ganancioso()), 
	GATILHO_ESTRESSE(new GatilhoEstresse()), GIRI(new Giri()), HABITO(new Habito()), HEROICO(new Heroico()),
	IDOSO(new Idoso()), INIMIGO(new Inimigo()), JOVEM(new Jovem()), LEAL(new Leal()), LISTA_NEGRA(new ListaNegra()),
	MAGNETICO(new Magnetico()), MANCO(new Manco()), MA_REPUTACAO(new MaReputacao()), MA_SORTE(new MaSorte()),
	MONITOR_INDICADO(new MonitorIndicado()), NANO_INFECCAO(new NanoInfeccao()), OBESO(new Obeso()),
	PACIFISTA(new Pacifista()), PECULIARIDADE(new Peculiaridade()), PEQUENO(new Pequeno()), 
	POBREZA(new Pobreza()), PROCURADO(new Procurado()), PROPRIEDADE(new Propriedade()), RACISTA(new Racista()),
	SANGUINARIO(new Sanguinario()), SEGREDO(new Segredo()), SEM_NOCAO(new SemNocao()),
	TALENTO_LATENTE(new TalentoLatente()), TEIMOSO(new Teimoso()), TRAUMA_GUERRA(new TraumaGuerra()), 
	TREMORES(new Tremores()), UMA_PERNA_SO(new UmaPernaSo()), UM_BRACO_SO(new UmBracoSo()), 
	UM_OLHO_SO(new UmOlhoSo()), VINGATIVO(new Vingativo()), VISAO_RUIM(new VisaoRuim()), VOTO(new Voto());
	
	
	Complicacao complicacao;
	
	Complicacoes(Complicacao complicacao) {
		this.complicacao = complicacao;
	}
	
	public Complicacao get() {
		return complicacao;
	}
	
	public static Complicacao getRandom() {
		Complicacoes[] c = Complicacoes.values();
		Complicacao comp = null;
		int tamanho = c.length;
		int random = (int) (Math.random() * tamanho);
		
		for (int i = 0; i < tamanho; i++) {
			if (i == random)
				comp = c[i].get();
		}
		//System.out.println("Complicação escolhida = " + comp.getNome());
		return comp;
	}
}
