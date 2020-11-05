package core;

import exception.NotAvailablePointsLeftException;
import utils.NonStaticEnum;

public class Progresso extends NonStaticEnum implements Requisitavel, Identificavel, Cloneable {

	public static final Progresso NOVATO = new Progresso(0);
	public static final Progresso EXPERIENTE= new Progresso(20);
	public static final Progresso VETERANO = new Progresso(40);
	public static final Progresso HEROICO = new Progresso(60);
	public static final Progresso LENDARIO = new Progresso(80);

	private final Identidade id;
	private int experienciaAtual;
	private int ultimaExp;
	private double porcentProgresso; //Percentage for the next progress
	private String estagio;
	private byte progressoTotal;
	private byte progressoDisp;
	
	
	private Progresso() {
		super(Progresso.NOVATO.estagio, Progresso.class);
		setEstagio();
		id = new Identidade(estagio, Integer.valueOf(experienciaAtual).toString());
	}

	private Progresso(int experiencia) {
		super(Progresso.getNomeEstagio(experiencia), Progresso.class);
		this.setExperienciaAtual(experiencia);
		id = new Identidade(estagio, Integer.toString(experienciaAtual));
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

	private static String getNomeEstagio(int experiencia) {
		if(experiencia >= 0 && experiencia < 20)
			return "Novato";

		else if (experiencia >= 20 && experiencia < 40)
			return "Experiente";

		else if (experiencia >= 40 && experiencia < 60)
			return "Veterano";

		else if (experiencia >= 60 && experiencia < 80)
			return "Heróico";

		else if (experiencia >= 80)
			return "Lendário";

		else return "Experiência Negativa";
	}
	
	private void setEstagio() {
		estagio = getNomeEstagio(experienciaAtual);
	}
	
	public String getNomeEstagio() {
		return estagio;
	}
	
	private void setProgresso()	 {
		double progNovaExp = ((double) experienciaAtual - ultimaExp) / 5;
		porcentProgresso += progNovaExp;
		progressoDisp += (byte) porcentProgresso;
		progressoTotal = (byte) (experienciaAtual / 5);
	}

	private Progresso setExperienciaAtual(int experiencia){
		experienciaAtual = 0;
		if(experiencia >= 0)
			experienciaAtual +=  experiencia;
		else throw new IllegalArgumentException("Valor de \"experiencia\" não pode ser negativo!");
		setEstagio();
		setProgresso();
		return this;
	}
	
	public int useProgresso(int pontos) {
		if(pontos >= 0)
			if(pontos <= progressoDisp)
				progressoDisp -= pontos;
			else throw new NotAvailablePointsLeftException("Não há progresso suficiente para usar");
		else throw new IllegalArgumentException("O valor de \"pontos\" não pode ser negativo!");
		
		return progressoDisp;
	}

	public static Progresso getNovoProgresso(int experiencia) {
		return Progresso.NOVATO.setExperienciaAtual(experiencia);
	}

	public int getProgressoTotal() {
		return progressoTotal;
	}
	
	public int getProgressoDisp() {
		return progressoDisp;
	}

	@Override
	public boolean check(NPC npc) {
		return false;//npc.getProgresso().getExperiencia() >= this.getExperiencia();
	}

	@Override
	public Identidade getId() {
		return id;
	}
}
