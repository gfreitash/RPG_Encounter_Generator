package core;

import exception.NotAvailablePointsLeftException;

public class Progresso extends Core {
	private int experienciaAtual;
	private int ultimaExp;
	private double porcentProgresso; //Percentage for the next progress
	private String estagio;
	private byte progressoTotal;
	private byte progressoDisp;
	
	
	public Progresso() {
		super("", "");
		setEstagio();
		this.setNome(estagio);
		this.setDesc(Integer.valueOf(experienciaAtual).toString());
	}
	
	public Progresso(int experiencia) throws IllegalArgumentException {
		super("", "");
		if(experiencia >= 0)
			experienciaAtual +=  experiencia;
		else throw new IllegalArgumentException("Valor de \"experiencia\" não pode ser negativo!");
		setEstagio();
		setProgresso();
		this.setNome(estagio);
		this.setDesc(Integer.valueOf(experienciaAtual).toString());
	}
	
	public void addExperiencia(int experiencia) {
		if(experiencia >= 0) {
			ultimaExp = experienciaAtual;
			experienciaAtual +=  experiencia;
		} else throw new IllegalArgumentException("Valor de \"experiencia\" não pode ser negativo!");
		
		setEstagio();
		setProgresso();
	}
	
	public int getExperiencia() {
		return experienciaAtual;
	}
	
	private final void setEstagio() {
		if(experienciaAtual >= 0 && experienciaAtual < 20)
			estagio = "Novato";
		
		else if (experienciaAtual >= 20 && experienciaAtual < 40)
			estagio = "Experiente";
		
		else if (experienciaAtual >= 20 && experienciaAtual < 60)
			estagio = "Veterano";
		
		else if (experienciaAtual >= 60 && experienciaAtual < 80)
			estagio = "Heróico";
		
		else if (experienciaAtual >= 80)
			estagio = "Lendário";
	}
	
	public String getEstagio() {
		return estagio;
	}
	
	private void setProgresso()	 {
		double progNovaExp = (experienciaAtual - ultimaExp) / 5;
		porcentProgresso += progNovaExp;
		progressoDisp += (byte) porcentProgresso;
		progressoTotal = (byte) (experienciaAtual / 5);
	}
	
	public int useProgress(int pontos) {
		if(pontos >= 0)
			if(pontos <= progressoDisp)
				progressoDisp -= pontos;
			else throw new NotAvailablePointsLeftException("Não há progresso suficiente para usar");
		else throw new IllegalArgumentException("O valor de \"pontos\" não pode ser negativo!");
		
		return progressoDisp;
	}
	
	
	public int getProgressoTotal() {
		return progressoTotal;
	}
	
	public int getProgressoDisp() {
		return progressoDisp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((estagio == null) ? 0 : estagio.hashCode());
		result = prime * result + experienciaAtual;
		long temp;
		temp = Double.doubleToLongBits(porcentProgresso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + progressoDisp;
		result = prime * result + progressoTotal;
		result = prime * result + ultimaExp;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Progresso))
			return false;
		Progresso other = (Progresso) obj;
		if (estagio == null) {
			if (other.estagio != null)
				return false;
		} else if (!estagio.equals(other.estagio))
			return false;
		if (experienciaAtual != other.experienciaAtual)
			return false;
		if (Double.doubleToLongBits(porcentProgresso) != Double.doubleToLongBits(other.porcentProgresso))
			return false;
		if (progressoDisp != other.progressoDisp)
			return false;
		if (progressoTotal != other.progressoTotal)
			return false;
		if (ultimaExp != other.ultimaExp)
			return false;
		return true;
	}
	
}
