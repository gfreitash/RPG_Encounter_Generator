package core;

public abstract class Complicacao extends Core{
	private String tipoPossivel[];
	private String tipo;
	
	protected Complicacao() {
	}
	
	protected Complicacao(String tipo) throws IllegalArgumentException {
		boolean tipoValido = false;
		
		for(String x: tipoPossivel) {
			if(x.equals(tipo)) {
				tipoValido = true;
				break;
			}
			tipoValido = false;
		}
		
		if(tipoValido)
			this.tipo = tipo;
		else throw new IllegalArgumentException("Tipo inválido!");
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
