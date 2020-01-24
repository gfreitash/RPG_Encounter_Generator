package core;

public abstract class Pericia extends Core{
	private Atributo tipoAtributo;
	private byte nivelPericia;
	private boolean foiAtribuida;
	private byte modificador;
	private byte moficadorNivel;
	private String especializacao;
	
	protected Pericia(String nome, String desc, Atributo atrib){
		super(nome, desc);
		tipoAtributo = atrib;
		nivelPericia = 4;
	}
	
	protected Pericia(String nome, String desc, Atributo atrib, String especializacao){
		super(nome, desc);
		tipoAtributo = atrib;
		this.especializacao = especializacao;
		nivelPericia = 4;
	}
	
	
	protected Pericia(String nome, String desc, Atributo atrib, int nivelPericia){
		super(nome, desc);
		tipoAtributo = atrib;
		
		if(nivelPericia > 12 || nivelPericia < 4) 
			throw new IllegalArgumentException("Valor de 'nivelPericia' inválido");
		else this.nivelPericia = (byte) nivelPericia;
	}
	
	protected Pericia(String nome, String desc, Atributo atrib, int nivelPericia, String especializacao){
		super(nome, desc);
		tipoAtributo = atrib;
		this.especializacao = especializacao;
		
		if(nivelPericia > 12 || nivelPericia < 4) 
			throw new IllegalArgumentException("Valor de 'nivelPericia' inválido");
		else this.nivelPericia = (byte) nivelPericia;
	}
	
	public Atributo getTipoAtributo() {
		return tipoAtributo;
	}
	
	public String getEspecializacao() {
		return especializacao;
	}
	
	public byte getNivelPericia() {
		return nivelPericia;
	}
	
	public void atribuirPericia() {
		foiAtribuida = true;
	}
	
	public void addModificador(int mod) {
		modificador += mod;
	}
	
	public void addNivelPericia(int nivel, Membro m) throws IllegalArgumentException {
		if(nivel > 0 && nivel <= 4) 
			if(m.getPontosDispPeri() > 0) {
				nivelPericia += nivel * 2;
				if(m.getNivelAtributo(this.getTipoAtributo().getNome()) <= nivelPericia)
					m.subtractPontosDispPer(nivel * 2);
				else
					m.subtractPontosDispPer(nivel);
			} else throw new exception.NotAvailablePointsLeftException("Não há pontos suficientes disponíveis");
		else throw new IllegalArgumentException("Valor de 'nivel' inválido");
	}
	
	
}
