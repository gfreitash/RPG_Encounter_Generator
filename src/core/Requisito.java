package core;

public final class Requisito {
	private Vantagem[] vantagem;
	private Complicacao[] complicacao;
	private Atributo[] atributo;
	private Pericia[] pericia;
	private Faccao[] faccao;
	private Raca[] raca;
	private Veiculo[] veiculo;
	private Progresso progresso;
	private String requisitos = "";
	
	public static final int OBRIGATORIO = 0, OPCIONAL = 1, OPCIONAL_EXCLUDENTE = -1;
	
	public Requisito() {
		
	}
	
	public Requisito(Vantagem ... vantagem) {
		this.vantagem = vantagem;
	}
	
	public Requisito(Complicacao ... complicacao) {
		this.complicacao = complicacao;
	}
	
	public Requisito(Atributo ... atributo) {
		this.atributo = atributo;
	}
	
	public Requisito(Pericia ... pericia) {
		this.pericia = pericia;
	}
	
	public Requisito(Faccao ... faccao) {
		this.faccao = faccao;
	}
	
	public Requisito(Raca ... raca) {
		this.raca = raca;
	}
	
	public Requisito(Veiculo ... veiculo ) {
		this.veiculo = veiculo;
	}
	
	public Requisito(Progresso progresso) {
		this.progresso = progresso;
	}
	
	public String toString() {
		int i = 0;
		if(atributo != null) {
			requisitos = requisitos.concat("Atributo.\n\n");
			for(i = 0; i < atributo.length; i++)
				requisitos = requisitos.concat(atributo[i].getNome())
				.concat("(D").concat(Integer.toString(atributo[i].getNivelAtributo()))
				.concat(")\n");
		}
		
		if(pericia != null) {
			requisitos = requisitos.concat("Perícia.\n\n");
			for(i = 0; i < pericia.length; i++)
				requisitos = requisitos.concat(pericia[i].getNome())
				.concat("(D").concat(Integer.toString(pericia[i].getNivelPericia()))
				.concat(")\n");
		}
		
		if(complicacao != null) {
			requisitos = requisitos.concat("Complicação.\n\n");
			for(i = 0; i < complicacao.length; i++)
				requisitos = requisitos.concat(complicacao[i].getNome()).concat("\n");
		}
		
		if(vantagem != null) {
			requisitos = requisitos.concat("Vantagem.\n\n");
			for(i = 0; i < vantagem.length; i++)
				requisitos = requisitos.concat(vantagem[i].getNome()).concat("\n");
		}
		
		return requisitos;	
	}
	
	public Vantagem[] getVantagem() {	
		return vantagem;
	}
	
	public void setVantagem(Vantagem ... vantagem) {
		this.vantagem = vantagem;
	}
	
	public Complicacao[] getComplicacao() {
		return complicacao;
	}
	
	public void setComplicacao(Complicacao ... complicacao) {
		this.complicacao = complicacao;
	}
	
	public Atributo[] getAtributo() {
		return atributo;
	}
	
	public void setAtributo(Atributo ... atributo) {
		this.atributo = atributo;
	}
	
	public Pericia[] getPericia() {
		return pericia;
	}
	
	public void setPericia(Pericia ... pericia) {
		this.pericia = pericia;
	}
	
	public Faccao[] getFaccao() {
		return faccao;
	}
	
	public void setFaccao(Faccao ... faccao) {
		this.faccao = faccao;
	}
	
	public Raca[] getRaca() {
		return raca;
	}
	
	public void setRaca(Raca ... raca) {
		this.raca = raca;
	}
	
	public Veiculo[] getVeiculo() {
		return veiculo;
	}
	
	public void setVeiculo(Veiculo ... veiculo) {
		this.veiculo = veiculo;
	}
	
	public void setProgresso(Progresso progresso) {
		this.progresso = progresso;
	}
	
	public Progresso getProgresso() {
		return progresso;
	}
}
