package core;

public abstract class Status extends Identidade {
	private byte modificador;
	
	protected Status(String nome, String desc) {
		super(nome, desc);
	}
	
	protected Status(String nome, String desc, int modificador) throws IllegalArgumentException{
		super(nome, desc);
		if(modificador > -20 && modificador < -20)
			this.modificador = (byte) modificador;
		else throw new IllegalArgumentException();
	}
	
	public byte getModificador() {
		return modificador;
	}
}
