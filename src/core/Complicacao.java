package core;

public abstract class Complicacao extends Core{
	private String tipoPossivel[];
	private String tipo;
	
	protected Complicacao(String nome, String desc, String[] tipoPossivel) {
		super(nome, desc);
		this.tipoPossivel = tipoPossivel;
		int rand = (int) Math.random() * tipoPossivel.length;
		tipo = tipoPossivel[rand];
	}
	
	protected Complicacao(String nome, String desc,String[] tipoPossivel, String tipo) throws IllegalArgumentException {
		super(nome, desc);
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

	public boolean checkSeTipoValido(String tipo) {
		for(String x: tipoPossivel)
			if(x == tipo)
				return true;

		return false;
	}
}
