package core;

import exception.NotAvailablePointsLeftException;

public class Progresso {
	private int experienciaAtual;
	private int ultimaExp;
	private double porcentProgresso; //Percentage for the next progress
	private String estagio;
	private byte progressoTotal;
	private byte progressoDisp;
	
	
	public Progresso() {
		setEstagio();
	}
	
	public Progresso(int experiencia) throws IllegalArgumentException {
		if(experiencia >= 0)
			experienciaAtual +=  experiencia;
		else throw new IllegalArgumentException("Valor de \"experiencia\" não pode ser negativo!");
		setEstagio();
		setProgresso();
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
	
	
}
