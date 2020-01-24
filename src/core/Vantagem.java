package core;

import core.Membro;

public abstract class Vantagem extends Core{
	private String tipo;
	private String tipoDesc;
	private Requisito requisitos;
	private String especializacao = "";
	
	protected Vantagem(String nome, String desc, String tipo, String tipoDesc, Requisito ... requisitos) {
		super(nome, desc);
		this.tipo = tipo;
		this.tipoDesc = tipoDesc;
		
		if(requisitos.length > 0) {
			for(int i = 0; i < requisitos.length; i++) {
				this.requisitos.setAtributo(requisitos[i].getAtributo());
				this.requisitos.setComplicacao(requisitos[i].getComplicacao());
				this.requisitos.setProgresso(requisitos[i].getProgresso());
				this.requisitos.setFaccao(requisitos[i].getFaccao());
				this.requisitos.setPericia(requisitos[i].getPericia());
				this.requisitos.setRaca(requisitos[i].getRaca());
				this.requisitos.setVantagem(requisitos[i].getVantagem());
				this.requisitos.setVeiculo(requisitos[i].getVeiculo());
			}
		}
	}
	
	public String getTipo()	{
		return tipo;
	}
	
	public String getTipoDesc() {
		return tipoDesc;
	}
	
	public Requisito getRequisitos() {
		return requisitos;
	}
	
	public String getEspecializacao() {
		return especializacao;
	}
	
	public void showRequisitos() {
		int i;
		Atributo atrib[] = requisitos.getAtributo();
		if(atrib.length > 0)
			for(i = 0; i < atrib.length; i++)
				System.out.println("Atributo '" + atrib[i].getNome() + "' : D" 
									+ atrib[i].getNivelAtributo());
		System.out.println();
		
		Pericia peri[] = requisitos.getPericia();
		if(peri.length > 0) 
			for(i = 0; i < peri.length; i++)
				System.out.println("Pericia '" + peri[i].getNome() + "' : D" 
						+ peri[i].getNivelPericia());
		System.out.println();
		
		Vantagem vant[] = requisitos.getVantagem();
		if(vant.length > 0)
			for(i = 0; i < vant.length; i++) 
				System.out.println("Vantagem '" + vant[i].getNome() + "'.");
		System.out.println();
		
		Complicacao comp[] = requisitos.getComplicacao();
			if(comp.length > 0)
				for(i = 0; i < comp.length; i++) 
					System.out.println("Atributo '" + atrib[i].getNome() + "'.");
		System.out.println();
	}
	
	//TODO implement checkRequisitos() to check all traits of member
	// for now it just checks for core.Vantagem requirements
	public boolean checkRequisitos(Membro membro) {
		int numRequisitos = 0;
		int numRequisitosNecessarios = 0;
		
		if(requisitos.getAtributo().length > 0) {
			numRequisitosNecessarios++;
			if(membro.checkReqAtributo(requisitos.getAtributo()))
				numRequisitos++;
		}
		
		if(requisitos.getPericia().length > 0) {
			numRequisitosNecessarios++;
			if(membro.checkReqPericias(requisitos.getPericia()))
				numRequisitos++;
		}
		
		if(requisitos.getVantagem().length > 0) {
			numRequisitosNecessarios++;
			if(membro.checkReqVantagem(requisitos.getVantagem()))
				numRequisitos++;
		}
		
		if(requisitos.getComplicacao().length > 0) {
			numRequisitosNecessarios++;
			if(membro.checkReqComplicacao(requisitos.getComplicacao()))
				numRequisitos++;
		}
		
		if(requisitos.getProgresso() != null)
			numRequisitosNecessarios++;
			if(membro.getProgresso().getExperiencia() >= requisitos.getProgresso().getExperiencia())
				numRequisitos++;
		
		if(numRequisitos == numRequisitosNecessarios) return true;
		else return false;
	}
}
