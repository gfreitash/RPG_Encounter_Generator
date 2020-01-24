package core;

import atributo.*;
import exception.*;

public class Membro{

	private Agilidade agilidade;
	private Astucia astucia;
	private Espirito espirito;
	private Forca forca;
	private Vigor vigor;
	private byte pontosDispAtrib = 5, pontosDispPeri = 15;
	private Pericia pericias[] = new Pericia[25];
	private Vantagem vantagens[] = new Vantagem[25];
	private Complicacao complicacoes[] = new Complicacao[15];
	private byte creditoDasRuas;
	private byte carisma, movimentacao, resistencia, aparar, tensao, tier, raca, faccao;
	private boolean isCartaSelvagem;
	private Progresso progresso;
	private int credito, custoDeVida;
	
	public Membro(Agilidade agilidade, Astucia astucia, Espirito espirito, Forca forca, Vigor vigor) {
		this.agilidade = agilidade;
		this.astucia = astucia;
		this.espirito = espirito;
		this.forca = forca;
		this.vigor = vigor;
		
		carisma = 0;
		
		

	}
	
	
	
	//equipamentos[];
	//ciberImplantes[];
	//veiculos[];
	//idiomas[];
	
	public byte getPontosDispAtrib() {
		return pontosDispAtrib;
	}
	
	public void subtractPontosDispAtrib(int pontos) throws NotAvailablePointsLeftException {
		if(pontos <= pontosDispAtrib)
			pontosDispAtrib -= pontos;
		else throw new exception.NotAvailablePointsLeftException("O valor de 'pontos' é maior que a quantidade de pontos disponíveis");
	}
	
	public byte getNivelAtributo(String nomeAtributo) throws IllegalArgumentException {
		switch(nomeAtributo) {
			default:
				throw new IllegalArgumentException("Não foi encontrado o atributo do argumento inserido");
			
			case "Agilidade":
				return agilidade.getNivelAtributo();
			
			case "Astúcia":
				return astucia.getNivelAtributo();
			
			case "Espírito":
				return espirito.getNivelAtributo();
				
			case "Força":
				return forca.getNivelAtributo();
			
			case "Vigor":
				return vigor.getNivelAtributo();
		}
	}
	
	public boolean checkReqAtributo(Atributo[] requisitos) {
		int numRequisitos = requisitos.length;
		int numRequisitosEncontrados = 0;
		for(int i = 0; i < requisitos.length; i++)
			if(getNivelAtributo(requisitos[i].getNome()) >= requisitos[i].getNivelAtributo())
				numRequisitosEncontrados++;
		
		if(numRequisitosEncontrados == numRequisitos) return true;
		else return false;
	}
	
	
	public byte getPontosDispPeri() {
		return pontosDispPeri;
	}
	
	public void subtractPontosDispPer(int pontos) throws NotAvailablePointsLeftException {
		if(pontos <= pontosDispPeri)
			pontosDispPeri -= pontos;
		else throw new exception.NotAvailablePointsLeftException("O valor de 'pontos' é maior que a quantidade de pontos disponíveis");
	}
	
	public Pericia[] getPericias() {
		return pericias;
	}
	
	public byte getNivelPericia(String nomePericia) throws IllegalArgumentException{
		for(int i = 0; i < pericias.length;) {
			if(pericias[i].getNome() == nomePericia)
				return pericias[i].getNivelPericia();
		}
		
		throw new IllegalArgumentException("Não foi encontrada a perícia do argumento inserido");
	}
	
	public boolean checkReqPericias(Pericia[] requisitos) {
		int numRequisitos = requisitos.length;
		int numRequisitosEncontrados = 0;
		for(int i = 0; i < requisitos.length; i++)
req:		for(int j = 0; j < pericias.length; j++)
				if(pericias[j].getNome() == requisitos[i].getNome())
					if(pericias[j].getNivelPericia() >= requisitos[i].getNivelPericia()) {
						numRequisitosEncontrados++;
						break req;
					}
		
		if(numRequisitosEncontrados == numRequisitos) return true;
		else return false;		
	}
	
	public boolean checkReqVantagem(Vantagem[] requisitos) {
		int numRequisitos = requisitos.length;
		int numRequisitosEncontrados = 0;
		for(int i = 0; i < requisitos.length; i++)
req:		for(int j = 0; j < vantagens.length; j++)
				if(vantagens[j].getNome() == requisitos[i].getNome()) {
					numRequisitosEncontrados++;
					break req;
				}
		
		if(numRequisitosEncontrados == numRequisitos) return true;
		else return false;
	}
	
	public boolean checkReqComplicacao(Complicacao[] requisitos) {
		int numRequisitos = requisitos.length;
		int numRequisitosEncontrados = 0;
		for(int i = 0; i < requisitos.length; i++)
req:		for(int j = 0; j < complicacoes.length; j++)
				if(complicacoes[j].getNome() == requisitos[i].getNome()) {
					numRequisitosEncontrados++;
					break req;
				}
		
		if(numRequisitosEncontrados == numRequisitos) return true;
		else return false;
	}
	
	public Progresso getProgresso() {
		return progresso;
	}
	
	public void addExperiencia(int val) {
		progresso.addExperiencia(val);
	}
	
	public void addCreditoDasRuas(int credito) {
		creditoDasRuas += credito;
	}
	
	public void subtractCreditoDasRuas(int credito) throws NotAvailablePointsLeftException {
		if(credito <= creditoDasRuas) creditoDasRuas -= credito;
		else throw new exception.NotAvailablePointsLeftException("Não há Crédito das Ruas suficiente disponível");
	}
	
	public byte getCreditoDasRuas() {
		return creditoDasRuas;
	}
	
	public void addCarisma(byte ponto) {
		carisma += ponto;
	}
	
	public void addCredito(int credito) throws IllegalArgumentException {
		if(this.credito <= credito) credito += credito;
		else if(this.credito + credito >= 0) credito += credito;
		else throw new IllegalArgumentException("Não há crédito suficiente");
	}
	
}
