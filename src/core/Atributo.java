package core;

public abstract class Atributo extends Core {
	private byte nivelDado;
	
	public Atributo(String nome, String desc, int nivelDado) {
		super(nome, desc);
		if(nivelDado >= 4 && nivelDado <= 12) this.nivelDado = (byte) nivelDado;
		else throw new IllegalArgumentException("Valor de nivelDado inapropriado");
	}

	public Atributo(String nome, String desc) {
		super(nome, desc);
		nivelDado = 4;
	}
	
	public Atributo(Atributo atrib) {
		super(atrib.getNome(), atrib.getDesc());
		nivelDado = atrib.getNivelAtributo();
	}
	
	public byte getNivelAtributo() {
		return nivelDado;
	}
	
	public void addNivelAtributo(int nivel, Membro m) {
		if(nivel > 0 && nivel <= 4) 
			if(m.getPontosDispAtrib() > 0) {
				nivelDado += nivel * 2;
				m.subtractPontosDispAtrib((byte) nivel);
			} else throw new exception.NotAvailablePointsLeftException("Não há pontos suficientes disponíveis");
		else throw new IllegalArgumentException("Valor de 'nivel' inválido");
	}
}
