package core;

public abstract class Complicacao extends Core {
	private String tipoPossivel[];
	private String tipo;
	
	protected Complicacao(String nome, String desc, String tipo, String ... tipoPossivel) throws IllegalArgumentException {
		super(nome, desc);
		this.tipoPossivel = tipoPossivel;
		
		boolean tipoValido = false;
		for(int i = 0; i < tipoPossivel.length; i++) {
			if(tipo.equals(tipoPossivel[i]))
				tipoValido = true;
		}
		
		if(tipoValido) this.tipo = tipo;
		else throw new IllegalArgumentException("Valor de 'tipo' não é válido para essa Complicação");
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String[] getTipoPossivel() {
		return tipoPossivel;
	}
	
	public void aplicarModificadores(Membro m) throws IllegalArgumentException {
		
	}
}
