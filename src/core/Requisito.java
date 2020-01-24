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
