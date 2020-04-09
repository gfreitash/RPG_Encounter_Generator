package core;

public abstract class Complicacao extends Core{
	private String tipoPossivel[];
	private String tipo;
	
	//This constructor needs to be of type StringBuffer for desambiguation
	//TODO: Improve desambiguation to be less of a chore on subclasses
	protected Complicacao(StringBuffer ... tipoPossivel) {
		for(int i = 0; i < tipoPossivel.length; i++)
			this.tipoPossivel[i] = tipoPossivel[i].toString();
	}
	
	protected Complicacao(String tipo, String ... tipoPossivel) throws IllegalArgumentException {
		this.tipoPossivel = tipoPossivel;
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
